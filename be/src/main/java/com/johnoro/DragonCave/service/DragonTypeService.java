package com.johnoro.DragonCave.service;

import com.johnoro.DragonCave.entity.DragonType;

import java.util.List;

public interface DragonTypeService {
    List<DragonType> findAll();

    Object findById(int id);

    void saveOrUpdate(DragonType obj);

    void deleteById(int id);
}
