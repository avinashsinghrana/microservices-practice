package com.credable.currencyconversionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CurrencyConversionController {

    @Autowired
    CurrencyExchangeProxy proxy;

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
    public CurrencyConversionBean convertCurrency(@PathVariable Currency from, @PathVariable Currency to, @PathVariable BigDecimal quantity) {
        Map<String, Currency> uriVariables = new HashMap<>();
        uriVariables.put("from", from);
        uriVariables.put("to", to);
        ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}", CurrencyConversionBean.class, uriVariables);
        CurrencyConversionBean response = responseEntity.getBody();
        response.setQuantity(quantity);
        response.setTotalCalculatedAmount(quantity.multiply(response.getConversionMultiple()));
        return response;
    }

    @GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}/feign")
    public CurrencyConversionBean convertCurrencyUsingFeign(@PathVariable Currency from, @PathVariable Currency to, @PathVariable BigDecimal quantity) {
        CurrencyConversionBean response = proxy.retrieveExchangeValue(from, to);
        response.setQuantity(quantity);
        response.setTotalCalculatedAmount(quantity.multiply(response.getConversionMultiple()));
        return response;
    }
}
