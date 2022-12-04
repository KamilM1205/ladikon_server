package ru.ladikon.server.ladikon_server.ping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {

  private static final String message = "Hello, I'm working";

  @GetMapping(value = "/ping")
  public Ping ping() {
    return new Ping(message);
  }
}
