package com.demo.service.impl;

import com.demo.service.FlowerService;
import entity.two.FlowerEntity;
import mapper.two.FlowerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlowerServiceImpl implements FlowerService {

    @Autowired
    private FlowerMapper flowerMapper;


    @Override
    public List<FlowerEntity> getList() {

        return flowerMapper.getList();
    }

    @Override
    public FlowerEntity getById(Integer id) {

        return flowerMapper.getById(id);
    }


}
