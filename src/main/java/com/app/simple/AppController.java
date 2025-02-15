package com.app.simple;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {
  @GetMapping
  public String helloWorld() {
    return "Hello World from Testing Application!";
  }
}
