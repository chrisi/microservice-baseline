package com.thoughtworks;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

  @RequestMapping("/hello")
  public String hello() {
    return "Hello World! How are you?";
  }

  @RequestMapping("/address")
  @ResponseBody
  public Address getAddress() {
    return new Address("Christian Gebauer", "Asternweg 10", "63322", "Rödermark");
  }
}
