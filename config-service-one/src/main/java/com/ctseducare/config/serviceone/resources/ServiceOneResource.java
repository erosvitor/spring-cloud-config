package com.ctseducare.config.serviceone.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctseducare.config.serviceone.configs.Configurations;

@RestController
public class ServiceOneResource {
   
  @Autowired
  private Configurations configs;
  
  @GetMapping("/serviceone")
  public String hello() {
    return "Hello, I am service ONE from ConfigServer. The value of the configuration one is: " + configs.getOne();
  }

}
