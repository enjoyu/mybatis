package com.springboot.mybatis.controller;

import com.springboot.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //声明为一个Restful的Controller
public class UserController {
    @Autowired //注入userService
    private UserService userService;

    //显示
    @RequestMapping(value = "/show")
    public String show() {
        return userService.show();
    }

    //插入用户
    @RequestMapping(value="/insert")
    public String insert(String name, int age) {
        return userService.insert(name, age);
    }

    //根据年龄查询用户
    @RequestMapping(value = "/select")
    public Object select(int age) {
        return userService.select(age);
    }


}
