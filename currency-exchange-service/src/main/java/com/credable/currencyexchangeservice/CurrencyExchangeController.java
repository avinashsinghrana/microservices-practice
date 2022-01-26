package com.credable.currencyexchangeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.Objects;

@RestController
public class CurrencyExchangeController {

    @Autowired
    private Environment environment;

    @Autowired
    private ExchangeValueRepo repository;

    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    public ExchangeValue retrieveExchangeValue(@PathVariable Currency from, @PathVariable Currency to) {
        ExchangeValue reponse = repository.findByFromAndTo(from, to);
        reponse.setPort(Integer.valueOf(Objects.requireNonNull(environment.getProperty("local.server.port"))));
        return reponse;
    }
}
