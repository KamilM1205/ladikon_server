package ru.ladikon.server.ladikon_server.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ru.ladikon.server.ladikon_server.model.Ping;

@RestController
public class PingController {

  private static final String message = "Hello, I'm working";

  @GetMapping(value = "/ping")
  public Ping ping() {
    return new Ping(message);
  }
}
