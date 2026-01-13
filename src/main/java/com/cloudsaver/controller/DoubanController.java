package com.cloudsaver.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoubanController {
  @GetMapping("/api/douban/hot")
  public Map<String, Object> getHotList() {
    return Map.of("data", java.util.List.of());
  }

  @GetMapping("/api/douban/search")
  public Map<String, Object> search(@RequestParam("keyword") String keyword) {
    return Map.of("keyword", keyword, "data", java.util.List.of());
  }
}
