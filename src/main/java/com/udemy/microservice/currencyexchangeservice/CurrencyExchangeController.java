package com.udemy.microservice.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {

    @Autowired
    CurrencyExchangeService service;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue getExchangeValue(@PathVariable String from, @PathVariable String to){
        return service.getCurrencyByFromAndTo(from, to);
    }
}
