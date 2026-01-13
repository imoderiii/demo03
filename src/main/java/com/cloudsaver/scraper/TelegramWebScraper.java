package com.cloudsaver.scraper;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Component;

import com.cloudsaver.model.ResourceItem;

@Component
public class TelegramWebScraper {
  public List<ResourceItem> searchInWeb(String url) {
    return Collections.emptyList();
  }
}
