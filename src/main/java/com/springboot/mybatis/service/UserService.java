package com.springboot.mybatis.service;


import com.springboot.mybatis.entity.User;
import com.springboot.mybatis.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service //声明为服务
public class UserService {

    @Autowired //注入userMapper
    private UserMapper userMapper;

    public String show() {
        return "Hello World!";
    }

    //插入用户
    public String insert(String name, int age) { //插入一条记录
        User user = new User();
        user.setName(name);
        user.setAge(age);
        userMapper.insert(user);
        return "Insert ( \""+name+"\", age"+age+") OK!";
    }

    //根据年龄查询用户
    public List<User> select(int age) {
        return userMapper.select(age);
    }

}


