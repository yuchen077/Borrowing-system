package com.yuchen.borrowingsystem.service.impl;

import com.yuchen.borrowingsystem.dao.UserDao;
import com.yuchen.borrowingsystem.dto.UserRegisterRequest;
import com.yuchen.borrowingsystem.model.User;
import com.yuchen.borrowingsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User getUserById(Integer userId) {
        return userDao.getUserById(userId);
    }

    @Override
    public Integer register(UserRegisterRequest userRegisterRequest){
        return userDao.createUser(userRegisterRequest);
    }
}
