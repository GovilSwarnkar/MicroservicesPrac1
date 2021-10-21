package com.microservices.prac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MeasurementConversionServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MeasurementConversionServiceApplication.class, args);
	}

}
