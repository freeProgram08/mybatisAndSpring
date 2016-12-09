package com.mytest.controller;

import com.mytest.service.UserService;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/12/8.
 */
@Controller
public class TestController {
    @Resource
    UserService userService;

    @RequestMapping("/foo")
    public String hello(){
        return "index";
    }
}
