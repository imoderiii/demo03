package com.cloudsaver.model;

import java.util.List;

public class SearchResponse {
  private List<ChannelResult> data;

  public SearchResponse() {
  }

  public SearchResponse(List<ChannelResult> data) {
    this.data = data;
  }

  public List<ChannelResult> getData() {
    return data;
  }

  public void setData(List<ChannelResult> data) {
    this.data = data;
  }
}
