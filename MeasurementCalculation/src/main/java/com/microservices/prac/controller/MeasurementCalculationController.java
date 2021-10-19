package com.microservices.prac.controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.microservices.prac.bean.MeasurementConversion;

@RestController
public class MeasurementCalculationController {

	@GetMapping("/measurement-calculation/from/{from}/to/{to}/factor/{factor}")
	public MeasurementConversion getMeasurementCalculatedValue(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal factor) {
		Map<String, String> uriVariables = new HashMap<String, String>();
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		
		ResponseEntity<MeasurementConversion> responseEntity = new RestTemplate().getForEntity(
				"http://localhost:8000/measurement-conversion/from/{from}/to/{to}",  MeasurementConversion.class, uriVariables);
		
		MeasurementConversion measurementConversion = responseEntity.getBody();
		return new MeasurementConversion(measurementConversion.getId(), from, to, factor,  measurementConversion.getConversionMultiple(), 
				factor.multiply(measurementConversion.getConversionMultiple()), measurementConversion.getPort());
	}
}
