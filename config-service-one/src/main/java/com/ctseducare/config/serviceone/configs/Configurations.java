package com.ctseducare.config.serviceone.configs;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("configuration")
public class Configurations {

  private String one;
  private String two;

  public Configurations() {
  }

  public String getOne() {
    return one;
  }

  public void setOne(String one) {
    this.one = one;
  }

  public String getTwo() {
    return two;
  }

  public void setTwo(String two) {
    this.two = two;
  }

}
