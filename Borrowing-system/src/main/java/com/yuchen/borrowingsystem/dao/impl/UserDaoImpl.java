package com.yuchen.borrowingsystem.dao.impl;

import com.yuchen.borrowingsystem.dao.UserDao;
import com.yuchen.borrowingsystem.dto.UserRegisterRequest;
import com.yuchen.borrowingsystem.model.User;
import com.yuchen.borrowingsystem.rowmapper.UserRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    @Override
    public User getUserById(Integer userId) {
        String sql = "SELECT * FROM user WHERE user_id = :userId";

        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);

        List<User> userList = namedParameterJdbcTemplate.query(sql, map, new UserRowMapper());

        if(userList.size() > 0){
            return userList.get(0);
        }
        else{
            return null;
        }
    }

    @Override
    public Integer createUser(UserRegisterRequest userRegisterRequest) {
        String sql = "INSERT INTO user(phone_number, password, user_name, registration_time, last_modifiedtime, last_login_time)" +
                     "VALUES (:phoneNumber, :password, :userName, :registrationTime, :lastModifiedtime, :lastLoginTime)";

        Map<String, Object> map = new HashMap<>();
        map.put("phoneNumber", userRegisterRequest.getPhoneNumber());
        map.put("password", userRegisterRequest.getPassword());
        map.put("userName", userRegisterRequest.getUserName());

        Date now = new Date();
        map.put("registrationTime", now);
        map.put("lastModifiedtime", now);
        map.put("lastLoginTime", null);

        KeyHolder keyHolder = new GeneratedKeyHolder();

        namedParameterJdbcTemplate.update(sql, new MapSqlParameterSource(map), keyHolder);

        int userId = keyHolder.getKey().intValue();

        return userId;
    }
}
