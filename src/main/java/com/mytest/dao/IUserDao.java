package com.mytest.dao;

import com.mytest.entity.User;

import java.util.List;

/**
 * Created by Administrator on 2016/12/8.
 */
public interface IUserDao {
    User selectByName(String name);
List<User> selectAll();
}
