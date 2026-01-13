package com.cloudsaver.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SettingController {
  @GetMapping("/api/setting/get")
  public Map<String, Object> getSettings() {
    Map<String, Object> response = new HashMap<>();
    response.put("data", new HashMap<String, Object>());
    return response;
  }

  @PostMapping("/api/setting/save")
  public Map<String, Object> saveSettings(@RequestBody Map<String, Object> payload) {
    Map<String, Object> response = new HashMap<>();
    response.put("status", "ok");
    response.put("payload", payload);
    return response;
  }
}
