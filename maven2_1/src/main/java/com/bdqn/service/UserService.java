package com.bdqn.service;

import com.bdqn.mapper.ClassInfoMapper;
import com.bdqn.mapper.UserMapper;
import com.bdqn.pojo.ClassInfo;
import com.bdqn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserMapper userMaper;
    @Autowired
    private ClassInfoMapper classInfoMapper;

    public boolean login(String name,String password){
        return userMaper.login(name,password)>0?true:false;
    }
    public List<User> select(){
        userMaper.selects();
        System.out.println("select");
        return userMaper.selects();
    }
    public void insert(User user){
        userMaper.insert(user);
    }
    public List<ClassInfo> cselect(){
        return classInfoMapper.select();
    }
}
