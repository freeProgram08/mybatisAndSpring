package com.mytest.controller;

import com.mytest.entity.User;
import com.mytest.service.UserService;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2016/12/8.
 */
@Controller
public class TestController {
    @Resource
    UserService userService;
    /*@RequestMapping path属性绑定服务地址*/
    @RequestMapping(path = "/foo")
    public String hello(HttpServletRequest request) {
        List<User> users = userService.getUsers();
        request.setAttribute("users", users);
       /* 方法的返回值决定重定向，传递请求地址*/
       /*默认的不作特殊处理的返回值是传递请求*/
        return "index";
    }

    @RequestMapping(path = "/test")
    public String a(){
        /*返回字符串添加redirect:前缀代表重定向*/
        return "redirect:/foo";
    }
}
