package com.cloudsaver.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cloudsaver.config.CloudSaverProperties;
import com.cloudsaver.model.ChannelInfo;
import com.cloudsaver.model.ChannelResult;
import com.cloudsaver.model.SearchResponse;
import com.cloudsaver.scraper.TelegramWebScraper;

@Service
public class SearchService {
  private final CloudSaverProperties properties;
  private final TelegramWebScraper scraper;

  public SearchService(CloudSaverProperties properties, TelegramWebScraper scraper) {
    this.properties = properties;
    this.scraper = scraper;
  }

  public SearchResponse searchAll(String keyword, String channelId, String lastMessageId) {
    List<String> channels = new ArrayList<>(properties.getTelegram().getChannels());
    if (channelId != null && !channelId.isBlank()) {
      channels = List.of(channelId);
    }

    List<ChannelResult> results = new ArrayList<>();
    for (String channel : channels) {
      String url = buildSearchUrl(channel, keyword, lastMessageId);
      ChannelResult result = new ChannelResult();
      result.setId(channel);
      result.setChannelInfo(new ChannelInfo(channel, null));
      result.setList(scraper.searchInWeb(url));
      results.add(result);
    }

    return new SearchResponse(results);
  }

  private String buildSearchUrl(String channelId, String keyword, String lastMessageId) {
    StringBuilder url = new StringBuilder();
    url.append(properties.getTelegram().getBaseUrl());
    if (!url.toString().endsWith("/")) {
      url.append('/');
    }
    url.append(channelId);
    if (keyword != null && !keyword.isBlank()) {
      url.append("?q=").append(keyword);
    }
    if (lastMessageId != null && !lastMessageId.isBlank()) {
      if (url.toString().contains("?")) {
        url.append("&");
      } else {
        url.append("?");
      }
      url.append("before=").append(lastMessageId);
    }
    return url.toString();
  }
}
