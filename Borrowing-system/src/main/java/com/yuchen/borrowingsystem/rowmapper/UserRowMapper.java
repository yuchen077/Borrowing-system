package com.yuchen.borrowingsystem.rowmapper;

import com.yuchen.borrowingsystem.model.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapper implements RowMapper<User> {

    @Override
    public User mapRow(ResultSet resultSet, int i ) throws SQLException {
        User user = new User();
        user.setUserId(resultSet.getInt("user_id"));
        user.setPhoneNumber(resultSet.getString("phone_number"));
        user.setPassword(resultSet.getString("password"));
        user.setUserName(resultSet.getString("user_name"));
        user.setRegistrationTime(resultSet.getDate("registration_time"));
        user.setLastModifiedtime(resultSet.getDate("last_modifiedtime"));
        user.setLastLoginTime(resultSet.getDate("last_login_time"));

        return user;
    }
}
