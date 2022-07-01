package com.johnoro.DragonCave.dao;

import com.johnoro.DragonCave.entity.DragonType;

import java.util.List;

public interface DragonTypeDAO {
    List<DragonType> findAll();

    Object findById(int id);

    void saveOrUpdate(DragonType obj);

    void deleteById(int id);
}
