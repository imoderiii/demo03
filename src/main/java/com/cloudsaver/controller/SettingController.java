package com.cloudsaver.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SettingController {
  @GetMapping("/api/setting/get")
  public Map<String, Object> getSettings() {
    return Map.of("data", Map.of());
  }

  @PostMapping("/api/setting/save")
  public Map<String, Object> saveSettings(@RequestBody Map<String, Object> payload) {
    return Map.of("status", "ok", "payload", payload);
  }
}
