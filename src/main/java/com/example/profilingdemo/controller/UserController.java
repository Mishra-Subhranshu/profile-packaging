package com.example.profilingdemo.controller;

import com.example.profilingdemo.entity.User;
import com.example.profilingdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/get")
    public List<User> findAllUser() {
        return userService.getUser();
    }

    @PostMapping("/post")
    public long postUser(@RequestBody User user) {
        System.out.println("userName"+ user.getName());
        userService.saveUser(user);
        return user.getId();
    }
}
