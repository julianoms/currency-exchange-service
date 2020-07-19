package com.udemy.microservice.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class CurrencyExchangeService {

    @Autowired
    CurrencyExchangeRepository repository;

    @Autowired
    Environment environment;

    public ExchangeValue getCurrencyByFromAndTo(String from, String to) {

        ExchangeValue exchangeValue = repository.findByFromAndTo(from, to);
        exchangeValue.setPort(Integer.valueOf(environment.getProperty("local.server.port")));
        return exchangeValue;
    }
}
