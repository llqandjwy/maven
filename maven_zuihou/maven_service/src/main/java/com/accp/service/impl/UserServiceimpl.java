package com.accp.service.impl;

import com.accp.mapper.StutdentMapper;
import com.accp.mapper.UserMapper;
import com.accp.pojo.Student;
import com.accp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class UserServiceimpl implements UserService {
    @Autowired
    public UserMapper userMapper;
    @Autowired
    public StutdentMapper stutdentMapper;
    public boolean login(String name,String password) {
        System.out.println(userMapper.login(name,password));
        return userMapper.login(name,password)>1?true:false;
    }


    public List<Student> select() {
        return stutdentMapper.select();
    }
}
