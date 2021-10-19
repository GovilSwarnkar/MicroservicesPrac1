package com.microservices.prac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservices.prac.bean.Convertion;

public interface MeasurementConversionRepositry extends JpaRepository<Convertion, Integer> {
	public Convertion findByFromAndTo(String from, String to);
}
