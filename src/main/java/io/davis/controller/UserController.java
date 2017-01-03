package io.davis.controller;

import io.davis.entity.User;
import io.davis.service.UserService;
import io.swagger.annotations.ApiOperation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Davis on 17/1/3.
 */
@RestController
public class UserController {

  @Autowired
  private UserService service;

  @ApiOperation("create user")
  @PostMapping("/users")
  public User crateUser(User user) {
    return service.createUser(user);
  }

  @ApiOperation("get user by name")
  @GetMapping("/users")
  public User getUserByName() {
    String name = "davis";
    return service.getUserByName(name);
  }
}
