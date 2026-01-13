package com.cloudsaver.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cloudsaver.model.SearchResponse;
import com.cloudsaver.service.SearchService;

@RestController
public class SearchController {
  private final SearchService searchService;

  public SearchController(SearchService searchService) {
    this.searchService = searchService;
  }

  @GetMapping("/api/search")
  public SearchResponse search(
      @RequestParam("keyword") String keyword,
      @RequestParam(value = "channelId", required = false) String channelId,
      @RequestParam(value = "lastMessageId", required = false) String lastMessageId) {
    return searchService.searchAll(keyword, channelId, lastMessageId);
  }
}
