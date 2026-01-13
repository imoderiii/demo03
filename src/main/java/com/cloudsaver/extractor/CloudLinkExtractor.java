package com.cloudsaver.extractor;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class CloudLinkExtractor {
  public List<String> extractCloudLinks(List<String> links) {
    return links;
  }

  public String detectCloudType(List<String> links) {
    if (links == null || links.isEmpty()) {
      return null;
    }
    return "unknown";
  }
}
