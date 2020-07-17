package com.udemy.microservice.currencyexchangeservice;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Builder
public class ExchangeValue {

    private Long id;
    private String from;
    private String to;
    private BigDecimal conversionMultiple;
    private Integer port;
}
