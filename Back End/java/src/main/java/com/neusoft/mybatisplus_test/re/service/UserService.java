package com.neusoft.mybatisplus_test.re.service;

import com.neusoft.mybatisplus_test.re.entity.Admin;
import com.neusoft.mybatisplus_test.re.entity.User;
import com.neusoft.mybatisplus_test.re.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserMapper userMapper;
    public void insertUser(User user){userMapper.insertUser(user);}

    public String selectUser(int user_id){return userMapper.selectUser(user_id);}

    public void updateUser(User user){userMapper.updateUser(user);}

    public void deleteUser(int user_id){userMapper.deleteUser(user_id);}
}