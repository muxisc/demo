package com.demo.service.impl;

import entity.one.UserEntity;


import mapper.one.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.demo.service.UserService;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;


    @Override
    public List<UserEntity> getList() {

        return userMapper.getList();
    }

    @Override
    public UserEntity getById(Integer id) {

        return userMapper.getById(id);
    }
}
