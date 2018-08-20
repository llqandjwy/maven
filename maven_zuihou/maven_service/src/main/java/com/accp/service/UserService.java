package com.accp.service;

import com.accp.pojo.Student;

import java.util.List;

public interface UserService {
    boolean login(String name,String password);
    List<Student> select();
}
