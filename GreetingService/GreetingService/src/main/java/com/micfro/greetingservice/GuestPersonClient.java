package com.micfro.greetingservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "guest-person-service")
public interface GuestPersonClient {

  @GetMapping("/guestperson")
  String getGuestPerson();
}