package ru.ladikon.server.ladikon_server.ping;

public class Ping {
  private final String content;

  public Ping(String content) {
    this.content = content;
  }

  public String getContent() {
    return content;
  }
}
