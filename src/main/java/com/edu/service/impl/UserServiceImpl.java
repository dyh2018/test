package com.edu.service.impl;

import com.edu.mapper.UserMapper;
import com.edu.pojo.User;
import com.edu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public boolean checkUser(User user) {
        int uid=user.getUid();
        String upass=user.getUpass();
        User resUser=userMapper.selectByPrimaryKey(uid);
        if(resUser.getUpass().equals(upass)){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String getUserType(User user) {
        int uid=user.getUid();
        User resUser=userMapper.selectByPrimaryKey(uid);
        return  resUser.getUsertype();
    }
}
