package com.wm.borrow.service.impl;

import com.wm.borrow.dao.UserMapper;
import com.wm.borrow.entity.User;
import com.wm.borrow.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService {

    UserMapper userMapper;

    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public User getUserInfo(String jobId) {
        return userMapper.selectOne(new User(jobId));
    }
}
