package com.micfro.greetingservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

@RestController
public class GreetingController {

  @Autowired
  private GreetingPhraseClient greetingPhraseClient;

  @Autowired
  private GuestPersonClient guestPersonClient;

  @GetMapping("/greeting-full")
  public String getFullGreeting()  {
    String greetingPhrase = greetingPhraseClient.getGreetingPhrase();
    String guestPerson = guestPersonClient.getGuestPerson();
    return greetingPhrase + " " + guestPerson + ". Welcome to Microservices World!";
  }
}