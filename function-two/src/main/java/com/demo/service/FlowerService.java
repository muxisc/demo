package com.demo.service;

import entity.two.FlowerEntity;

import java.util.List;

public interface FlowerService {

    List<FlowerEntity> getList();

    FlowerEntity getById(Integer id);

}
