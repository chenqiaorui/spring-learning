package com.example.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ricky.dubbo.serivce.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    // 远程服务变量注入
    @Reference
    HelloService helloService;

    @RequestMapping("hello")
    public String sayHello() {
        return helloService.sayHello("hello");
    }
}
