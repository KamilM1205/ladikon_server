package ru.ladikon.server.ladikon_server.model;

public class Ping {
  private final String content;

  public Ping(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }
}
