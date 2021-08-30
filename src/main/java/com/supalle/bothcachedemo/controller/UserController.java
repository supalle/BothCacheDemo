package com.supalle.bothcachedemo.controller;

import com.supalle.bothcachedemo.model.User;
import com.supalle.bothcachedemo.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Supalle
 * @date 2021/8/30
 */
@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public User findByUsername(String username) {
        return userService.findByUserName(username);
    }

}
