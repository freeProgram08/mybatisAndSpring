package com.mytest.service;

import com.mytest.dao.IUserDao;
import com.mytest.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Administrator on 2016/12/8.
 */
@Service
public class UserService {
    @Resource
    private IUserDao userDao;

    //业务就是一件事情的处理流程
    public boolean login(User user){
        User user1 = userDao.selectByName(user.getName());
        if(user1==null){
            return false;//用户名不存在
        }
        if(!user1.getPassword().equals(user.getPassword())){
            return false;//密码不正确
        }
        return true;//登录成功
    }
}
