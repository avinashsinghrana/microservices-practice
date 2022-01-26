package com.credable.propertiesconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PropertiesConfigServerApplication {

  public static void main(String[] args) {
    SpringApplication.run(PropertiesConfigServerApplication.class, args);
  }

}
