package com.bdqn.controller;

import com.bdqn.pojo.ClassInfo;
import com.bdqn.pojo.User;
import com.bdqn.service.UserService;
import com.bdqn.service.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class Usercontroller {
    @Autowired
    public UserService userService;
    @RequestMapping(path = "login")
    public String login(String name,String password){
        System.out.println(name);
        System.out.println(password);
        /*if(userService.login(name,password)){

            return "login";
        }*/
        Util u=new Util();
        System.out.println(u.login(name,password));
        if(u.login(name,password)){

            return "login";
        }
        return "index";
    }
    @PostMapping(path = "insert")
    public String insert(int id,String name,String password){
        User user=new User();
        user.setLid(id);
        user.setLname(name);
        user.setLpassword(password);
        userService.insert(user);
        return "login";
    }
    @RequestMapping(path = "/hos")
    @ResponseBody
    public List<User> hos(){
        return userService.select();
    }
    @GetMapping(path = "/ho")
    public String ho(){
        return "index";
    }
    @RequestMapping(path = "sel")
    @ResponseBody
    public List<ClassInfo> sel(){
        return userService.cselect();
    }
}
