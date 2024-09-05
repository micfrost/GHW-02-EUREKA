package com.micfro.greetingservice;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "greeting-phrase-service")
public interface GreetingPhraseClient {

  @GetMapping("/greetingphrase")
  String getGreetingPhrase();
}