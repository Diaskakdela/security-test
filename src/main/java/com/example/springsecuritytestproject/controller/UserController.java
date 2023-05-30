package com.example.springsecuritytestproject.controller;

import com.example.springsecuritytestproject.model.User;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    @PostMapping
    public String register(@RequestBody User user){
        return null;
    }
}
