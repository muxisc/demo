package com.demo.service;

import entity.one.UserEntity;

import java.util.List;

public interface UserService{

    List<UserEntity> getList();

    UserEntity getById(Integer id);

}
