package com.mytest.service;

import com.mytest.entity.User;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 *
 */
/*Repository 创建bean标签
默认bean id值为将类名第一个首写字母小写*/
@Repository
public class UserShow {
/*    引用bean标签
    默认会查找所有被创建bean符合类型匹配的bean对象*/
    /*如果查找到多个就会报错*/
   /*Resource ref赋值*/
     @Resource
    private User user;

    public  void showUserName(){
        System.out.println(user.getName());
    }
}
