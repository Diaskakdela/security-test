package com.example.springsecuritytestproject.controller;

import org.springframework.context.annotation.Role;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/admin")
public class ControllerForAdmin {
    @GetMapping
    @PreAuthorize("hasAuthority('ADMIN')")
    public String admin(){
        return "admin";
    }
}
