package com.microservices.prac.proxy;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.microservices.prac.bean.MeasurementConversion;

//@FeignClient(name = "measurement-conversion-service", url = "localhost:8000")
@FeignClient(name = "measurement-conversion-service") // load balancing will be automatically with the combination of feign & eureka
public interface MeasurementConversionProxy {

	@GetMapping("/measurement-conversion/from/{from}/to/{to}")
	public MeasurementConversion retrieveMeasurementConversion(@PathVariable("from") String from, @PathVariable("to") String to); 
}
