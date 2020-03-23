package com.example.hystrixservice.controller;

import com.example.hystrixservice.common.CommonResult;
import com.example.hystrixservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserHystrixController {

    @Autowired
    private UserService userService;
    @GetMapping("testFallback")
    public CommonResult testFallBback() {
        return userService.getUser();

    }
}
