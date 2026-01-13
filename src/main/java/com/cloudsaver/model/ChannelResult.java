package com.cloudsaver.model;

import java.util.List;

public class ChannelResult {
  private String id;
  private ChannelInfo channelInfo;
  private List<ResourceItem> list;

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ChannelInfo getChannelInfo() {
    return channelInfo;
  }

  public void setChannelInfo(ChannelInfo channelInfo) {
    this.channelInfo = channelInfo;
  }

  public List<ResourceItem> getList() {
    return list;
  }

  public void setList(List<ResourceItem> list) {
    this.list = list;
  }
}
