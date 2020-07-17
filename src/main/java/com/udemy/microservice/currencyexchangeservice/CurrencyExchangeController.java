package com.udemy.microservice.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

@RestController
public class CurrencyExchangeController {

    @Autowired
    Environment environment;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue getExchangeValue(@PathVariable String from, @PathVariable String to){
        return ExchangeValue.builder()
                .id(1000L)
                .from(from)
                .to(to)
                .conversionMultiple(BigDecimal.TEN)
                .port(Integer.valueOf(environment.getProperty("local.server.port")))
                .build();
    }
}
