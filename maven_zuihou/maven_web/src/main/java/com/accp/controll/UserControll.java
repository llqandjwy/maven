package com.accp.controll;

import com.accp.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserControll {
    @Autowired
    public UserService userService;
    @GetMapping(path = "login")
    public String login(String name,String password){
        System.out.println("controller");
        if(userService.login(name,password)){
            return "login";
        }
        return "index";
    }
    @GetMapping(path = "index")
    public String index(Model model){
        model.addAttribute("list",userService.select());
        return "login";
    }

}
