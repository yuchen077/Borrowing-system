package com.yuchen.borrowingsystem.service;

import com.yuchen.borrowingsystem.dto.UserLoginRequest;
import com.yuchen.borrowingsystem.dto.UserRegisterRequest;
import com.yuchen.borrowingsystem.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
