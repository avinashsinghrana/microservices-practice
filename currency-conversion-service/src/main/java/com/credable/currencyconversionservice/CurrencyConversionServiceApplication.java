package com.credable.currencyconversionservice;

import brave.sampler.Sampler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;

/**
 * we added @EnableFeignClients here to load clients from
 * in parameter , we have to pass the package which one have to scan
 */
@SpringBootApplication
@EnableFeignClients("com.credable.currencyconversionservice")
@EnableDiscoveryClient
public class CurrencyConversionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CurrencyConversionServiceApplication.class, args);
    }

    @Bean
    public Sampler defaultSampler() {
//        return new AlwaysSampler();
        return Sampler.ALWAYS_SAMPLE;
    }
}
