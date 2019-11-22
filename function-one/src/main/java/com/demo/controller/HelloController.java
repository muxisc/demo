package com.demo.controller;

import com.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller     //需跳转到页面，不能用@RestController
public class HelloController {

    @Autowired
    private UserService userService;


    @RequestMapping("/hello")
    public ModelAndView sayHello(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("hello");
        String name = userService.getById(1).getName();
        modelAndView.addObject("key", "您好！"+ name);

        return modelAndView;
    }

}
