package com.ricky.controller;

import com.ricky.common.CommonResult;
import com.ricky.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    // 打印日志工具
    private Logger LOGGER = LoggerFactory.getLogger(UserController.class);

    // 有序，可重复，查找快，添加删除慢，线程不安全
//    Object[] DEFAULTCAPACITY_EMPTY_ELEMENTDATA = {};
//    List<String> data = new ArrayList<>();
    User user = new User("admin","admin");

    @GetMapping("/user")
    public CommonResult list() {

        LOGGER.info("获取对象信息: {}", user.getUsername());
        return CommonResult.success(user);
    }

}

