package com.example.hystrixservice.service;

import com.example.hystrixservice.common.CommonResult;
import com.example.hystrixservice.model.User;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${service-url.user-service}")
    private String serviceUrl;

    // 服务降级方法
    @HystrixCommand(fallbackMethod = "getDefaultUser")
    public CommonResult getUser() {
        return restTemplate.getForObject(serviceUrl+"/user", CommonResult.class);
    }

    public CommonResult getDefaultUser() {
        User defaultUser = new User("ricky","ricky");
        return CommonResult.success(defaultUser);
    }
}
