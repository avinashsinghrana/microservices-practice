package com.credable.currencyconversionservice;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * name property for @FeignClient is not more important , but when we use ribbon service it will be required
 * <br>
 * if we enabled ribbon then url is not required, there is chance multiply instances having same microservices
 * according the load of server ribbon will shift request to another instance for microservive
 */

//@FeignClient(name = "currency-exchange-service", url = "localhost:8000")
@FeignClient(name = "currency-zuul-api-getway")
@RibbonClient(name = "currency-exchange-service")
public interface CurrencyExchangeProxy {
    /**
     * @param from field mapping is mandatory in case of older version
     * @param to   field mapping is mandatory in case of older version
     * @return CurrencyConversionBean
     */
//    @GetMapping("/currency-exchange/from/{from}/to/{to}")
    @GetMapping("currency-exchange-service/currency-exchange/from/{from}/to/{to}")
    CurrencyConversionBean retrieveExchangeValue(@PathVariable("from") Currency from, @PathVariable("to") Currency to);
}
