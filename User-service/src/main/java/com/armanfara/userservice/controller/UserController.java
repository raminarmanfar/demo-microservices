package com.armanfara.userservice.controller;

import com.armanfara.userservice.entity.User;
import com.armanfara.userservice.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
@Slf4j
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public List<User> findAll() {
        log.info("Inside findAll of UserController");
        return userService.findAll();
    }

    @GetMapping("/{id}")
    public User findById(@PathVariable("id") Long userId) {
        log.info("Inside findById of UserController");
        return userService.findById(userId);
    }

    @PostMapping("/")
    public User save(@RequestBody User user) {
        log.info("Inside save of UserController");
        return userService.save(user);
    }
}
