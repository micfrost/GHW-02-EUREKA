package com.micfro.guestpersonservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class GuestPersonServiceApplication {

  public static void main(String[] args) {
    SpringApplication.run(GuestPersonServiceApplication.class, args);
  }
}

@RestController
class GuestPersonController {

  @GetMapping("/guestperson")
  public String getGuestPerson() {
    return "Michal";
  }
}