package com.demo.controller;

import entity.one.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.demo.service.UserService;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/getList")
    public List<UserEntity> getList(){
        System.out.println("hhh");
        return userService.getList();
    }

    @GetMapping("/getById/{id}")
    public UserEntity getById(@PathVariable("id") Integer id){

        return userService.getById(id);
    }

}
