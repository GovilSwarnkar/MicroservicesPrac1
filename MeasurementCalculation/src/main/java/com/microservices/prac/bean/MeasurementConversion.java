package com.microservices.prac.bean;

import java.math.BigDecimal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MeasurementConversion {
	private Integer id;
	private String from;
	private String to;
	private BigDecimal conversionMultiple;
	private BigDecimal factor;
	private BigDecimal calulatedValue;
	private int port;
}
