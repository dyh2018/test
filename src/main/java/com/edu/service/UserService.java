package com.edu.service;

import com.edu.pojo.User;

public interface UserService {
    public boolean checkUser(User user);
    public String getUserType(User user);
}
