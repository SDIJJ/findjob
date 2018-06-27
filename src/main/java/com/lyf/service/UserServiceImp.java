package com.lyf.service;

import com.lyf.mapper.UserMapper;
import com.lyf.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by fangjiejie on 2018/6/27.
 */
@Service
public class UserServiceImp {
    @Autowired
    private UserMapper userMapper;
    public User login(String username,String password){
        return  userMapper.login(username,password);
    }
}
