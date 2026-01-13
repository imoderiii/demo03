package com.cloudsaver.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeleImageController {
  @GetMapping("/api/tele-images")
  public Map<String, Object> listImages() {
    return Map.of("data", java.util.List.of());
  }
}
