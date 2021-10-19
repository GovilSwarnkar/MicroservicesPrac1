package com.microservices.prac.bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Convertion {
	
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "from_value")
	private String from;
	
	@Column(name = "to_value")
	private String to;
	private BigDecimal conversionMultiple;
	private int port;
}
