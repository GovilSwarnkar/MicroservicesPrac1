package com.microservices.prac.controller;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.prac.bean.MeasurementConversion;

@RestController
public class MeasurementCalculationController {

	@GetMapping("/measurement-calculation/from/{from}/to/{to}/factor/{factor}")
	public MeasurementConversion getMeasurementCalculatedValue(@PathVariable String from, @PathVariable String to, @PathVariable BigDecimal factor) {
		return new MeasurementConversion(1001, from, to, factor,  BigDecimal.valueOf(10), factor.multiply(BigDecimal.valueOf(23)), 0);
	}
}
