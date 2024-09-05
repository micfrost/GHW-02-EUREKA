package com.micfro.greetingphraseservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GreetingPhraseServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(GreetingPhraseServiceApplication.class, args);
  }
}

@RestController
class GreetingPhraseController {

  @GetMapping("/greetingphrase")
  public String getGreetingPhrase() {
    return "Hello";
  }
}