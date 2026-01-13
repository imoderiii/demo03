package com.cloudsaver.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SponsorController {
  @GetMapping("/api/sponsors")
  public Map<String, Object> listSponsors() {
    Map<String, Object> response = new HashMap<>();
    response.put("data", Collections.emptyList());
    return response;
  }
}
