package com.edu.controller;

import com.edu.pojo.User;
import com.edu.service.UserService;
import com.edu.utils.IMoocJSONResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping(value = "/login")
    public IMoocJSONResult login(@RequestBody User user){
        if(userService.checkUser(user)){
            user.setUpass(null);
            String userType=user.getUsertype();
            user.setUsertype(userType);
            IMoocJSONResult.ok(user);
        }
        else{
            return  IMoocJSONResult.errorMsg("登录失败");
        }
        return null;
    }
}
