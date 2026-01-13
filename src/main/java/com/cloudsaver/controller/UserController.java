package com.cloudsaver.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
  @PostMapping("/api/user/login")
  public Map<String, Object> login(@RequestBody Map<String, Object> payload) {
    Map<String, Object> response = new HashMap<>();
    response.put("status", "ok");
    response.put("payload", payload);
    return response;
  }

  @PostMapping("/api/user/register")
  public Map<String, Object> register(@RequestBody Map<String, Object> payload) {
    Map<String, Object> response = new HashMap<>();
    response.put("status", "ok");
    response.put("payload", payload);
    return response;
  }
}
