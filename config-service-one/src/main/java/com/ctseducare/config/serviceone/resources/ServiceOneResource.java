package com.ctseducare.config.serviceone.resources;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceOneResource {
  
  @Value("${configuration.one}")
  private String configurationOne;
  
  @GetMapping("/serviceone")
  public String hello() {
    return "Hello, I am service ONE from ConfigServer. The value of the configuration one is: " + configurationOne;
  }

}
