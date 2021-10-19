package com.microservices.prac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.microservices.prac.bean.Convertion;
import com.microservices.prac.repository.MeasurementConversionRepositry;

@RestController
public class MeasurementConversionController {

	@Autowired
	private Environment envionment;  //for duplicate and different port  in run configuration -> -Dserver.port=8001
	
	@Autowired
	MeasurementConversionRepositry repository;
	
	@GetMapping("/measurement-conversion/from/{from}/to/{to}")  //http://localhost:8000/measurement-conversion/from/mili/to/meter
	public Convertion retrieveMeasurementConversion(@PathVariable String from, @PathVariable String to) {
		Convertion convertedValue = repository.findByFromAndTo(from, to);
		return new Convertion(10001, convertedValue.getFrom(), convertedValue.getTo(), 
				convertedValue.getConversionMultiple(), Integer.parseInt(envionment.getProperty("local.server.port")));
	}
}
