package com.cloudsaver.controller;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoubanController {
  @GetMapping("/api/douban/hot")
  public Map<String, Object> getHotList() {
    Map<String, Object> response = new HashMap<>();
    response.put("data", Collections.emptyList());
    return response;
  }

  @GetMapping("/api/douban/search")
  public Map<String, Object> search(@RequestParam("keyword") String keyword) {
    Map<String, Object> response = new HashMap<>();
    response.put("keyword", keyword);
    response.put("data", Collections.emptyList());
    return response;
  }
}
