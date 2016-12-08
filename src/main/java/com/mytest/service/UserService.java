package com.mytest.service;

import com.mytest.dao.IUserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/12/8.
 */
@Service
public class UserService {
    @Resource
    private IUserDao userDao;
    public void foo(){
        System.out.println(userDao);
    }
}
