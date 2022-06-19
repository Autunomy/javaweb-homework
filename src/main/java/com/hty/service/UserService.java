package com.hty.service;

import com.hty.entity.User;
import com.hty.mapper.UserMapper;

import java.sql.Date;
import java.sql.SQLException;

public class UserService {
    private UserMapper userMapper = new UserMapper();


    public UserService() throws Exception {
    }

    public User selectUserByUsernameAndPassword(String username, String password) throws SQLException {
        return userMapper.selectUserByUsernameAndPassword(username, password);
    }

    public int addUser(String username, String password, Date date, String xueyuan) throws SQLException {
        return userMapper.addUser(username, password, date, xueyuan);
    }
}
