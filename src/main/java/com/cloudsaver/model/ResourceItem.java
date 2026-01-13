package com.cloudsaver.model;

import java.util.List;

public class ResourceItem {
  private String messageId;
  private String title;
  private String content;
  private String pubDate;
  private String image;
  private List<String> cloudLinks;
  private String cloudType;
  private List<String> tags;

  public String getMessageId() {
    return messageId;
  }

  public void setMessageId(String messageId) {
    this.messageId = messageId;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public String getPubDate() {
    return pubDate;
  }

  public void setPubDate(String pubDate) {
    this.pubDate = pubDate;
  }

  public String getImage() {
    return image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public List<String> getCloudLinks() {
    return cloudLinks;
  }

  public void setCloudLinks(List<String> cloudLinks) {
    this.cloudLinks = cloudLinks;
  }

  public String getCloudType() {
    return cloudType;
  }

  public void setCloudType(String cloudType) {
    this.cloudType = cloudType;
  }

  public List<String> getTags() {
    return tags;
  }

  public void setTags(List<String> tags) {
    this.tags = tags;
  }
}
