package com.cloudsaver.config;

import java.util.Collections;
import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "cloudsaver")
public class CloudSaverProperties {
  private Telegram telegram = new Telegram();
  private List<String> cloudPatterns = Collections.emptyList();

  public Telegram getTelegram() {
    return telegram;
  }

  public void setTelegram(Telegram telegram) {
    this.telegram = telegram;
  }

  public List<String> getCloudPatterns() {
    return cloudPatterns;
  }

  public void setCloudPatterns(List<String> cloudPatterns) {
    this.cloudPatterns = cloudPatterns;
  }

  public static class Telegram {
    private String baseUrl;
    private List<String> channels = Collections.emptyList();

    public String getBaseUrl() {
      return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
      this.baseUrl = baseUrl;
    }

    public List<String> getChannels() {
      return channels;
    }

    public void setChannels(List<String> channels) {
      this.channels = channels;
    }
  }
}
