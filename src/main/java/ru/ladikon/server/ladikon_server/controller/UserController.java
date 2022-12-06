package ru.ladikon.server.ladikon_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ru.ladikon.server.ladikon_server.model.User;
import ru.ladikon.server.ladikon_server.service.UserService;

@RestController
@RequestMapping(value = "/user/*")
public class UserController {

  private final UserService userService;

  @Autowired
  public UserController(UserService userService) {
    this.userService = userService;
  }

  @GetMapping(value = "/get_info")
  @ResponseBody
  public ResponseEntity<User> get_info(@RequestParam("user_id") int user_id) {
    if (userService.exists(user_id)) {
      User user = userService.read(user_id);
      user.setTokens(null);
      return new ResponseEntity<>(user, HttpStatus.OK);
    }

    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
  }

  @PostMapping(value = "/registrate")
  @ResponseBody
  public ResponseEntity<HttpStatus> registrate(@RequestBody User user) {
    if (userService.create(user)) {
      return new ResponseEntity<>(HttpStatus.CREATED);
    }

    return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
  }

}
