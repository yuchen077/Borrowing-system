package com.yuchen.borrowingsystem.dao;

import com.yuchen.borrowingsystem.dto.UserRegisterRequest;
import com.yuchen.borrowingsystem.model.User;

public interface UserDao {

    User getUserById(Integer userId);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
