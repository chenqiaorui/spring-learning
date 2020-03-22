package com.example.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.ricky.dubbo.serivce.HelloService;
import org.springframework.stereotype.Component;

// 泛指各种组件（如@Service），将Bean实例化到Spring容器中
@Component
// @Service注解是dubbo提供的
@Service
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        return "Hello " + name;
    }
}
