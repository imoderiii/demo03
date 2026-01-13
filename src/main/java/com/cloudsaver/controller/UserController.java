package com.cloudsaver.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  @PostMapping("/api/user/login")
  public Map<String, Object> login(@RequestBody Map<String, Object> payload) {
    return Map.of("status", "ok", "payload", payload);
  }

  @PostMapping("/api/user/register")
  public Map<String, Object> register(@RequestBody Map<String, Object> payload) {
    return Map.of("status", "ok", "payload", payload);
  }
}
