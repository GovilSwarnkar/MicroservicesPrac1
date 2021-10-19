package com.microservice.prac.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.prac.bean.HomeDet;
import com.microservice.prac.configuration.HomeConfiguration;

@RestController
public class HomeConfigurationController {

	@Autowired
	private HomeConfiguration homeConfiguration;
	
	@GetMapping("/home-deatils")   //http://localhost:8080/planets/distance/eartch/Jupiter
	public HomeDet getPlanetDetails() {
		return new HomeDet( homeConfiguration.getHeight(), homeConfiguration.getWidth());
	}
}
