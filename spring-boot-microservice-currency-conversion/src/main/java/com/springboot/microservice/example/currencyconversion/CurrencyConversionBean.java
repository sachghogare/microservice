package com.springboot.microservice.example.currencyconversion;

import java.math.BigDecimal;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class CurrencyConversionBean {
	  private Long id;
	  private String from;
	  private String to;
	  private BigDecimal conversionMultiple;
	  private BigDecimal quantity;
	  private BigDecimal totalCalculatedAmount;
	  private int port;

	  public CurrencyConversionBean() {

	  }

	  public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionMultiple, BigDecimal quantity,
	      BigDecimal totalCalculatedAmount, int port) {
	    super();
	    this.id = id;
	    this.from = from;
	    this.to = to;
	    this.conversionMultiple = conversionMultiple;
	    this.quantity = quantity;
	    this.totalCalculatedAmount = totalCalculatedAmount;
	    this.port = port;
	  }
}