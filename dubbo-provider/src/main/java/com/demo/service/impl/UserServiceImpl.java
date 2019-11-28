package com.demo.service.impl;


import com.alibaba.dubbo.config.annotation.Service;

import com.demo.service.UserService;
import entity.DubboUserEntity;
import mapper.DubboUserMapper;
import org.springframework.beans.factory.annotation.Autowired;


@Service        //@Service注解是dubbo注解，注意不要倒错包
@org.springframework.stereotype.Service
public class UserServiceImpl implements UserService {

    @Autowired
    private DubboUserMapper dubboUserMapper;


    @Override
    public DubboUserEntity getUser(int id) {

        return dubboUserMapper.getUser(id);
    }

}
