package com.ding.controller;

import com.ding.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // @Controller + @Responsebody
@Slf4j // log注解
public class HelloController {
    @RequestMapping("hello")
    public String hello() {
        return "hello";
    }
    @RequestMapping("findUser")
    public User findUser() {
        User user = new User();
        user.setName("mark");
        user.setSex("F");
        return user;
    }
}
