package com.cloudsaver.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeleImageController {
  @GetMapping("/api/tele-images")
  public Map<String, Object> listImages() {
    Map<String, Object> response = new HashMap<>();
    response.put("data", Collections.emptyList());
    return response;
  }
}
