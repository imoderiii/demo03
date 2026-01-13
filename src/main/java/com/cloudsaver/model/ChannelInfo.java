package com.cloudsaver.model;

public class ChannelInfo {
  private String name;
  private String channelLogo;

  public ChannelInfo() {
  }

  public ChannelInfo(String name, String channelLogo) {
    this.name = name;
    this.channelLogo = channelLogo;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getChannelLogo() {
    return channelLogo;
  }

  public void setChannelLogo(String channelLogo) {
    this.channelLogo = channelLogo;
  }
}
