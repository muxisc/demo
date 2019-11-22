package com.demo.controller;

import com.demo.service.FlowerService;
import entity.two.FlowerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/flower")
public class FlowerController {

    @Autowired
    private FlowerService flowerService;


    @GetMapping("/getList")
    public List<FlowerEntity> getList(){

        return flowerService.getList();
    }

    @GetMapping("/getById/{id}")
    public FlowerEntity getById(@PathVariable("id") Integer id){

        return flowerService.getById(id);
    }

}
