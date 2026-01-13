package com.cloudsaver.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SponsorController {
  @GetMapping("/api/sponsors")
  public Map<String, Object> listSponsors() {
    return Map.of("data", java.util.List.of());
  }
}
