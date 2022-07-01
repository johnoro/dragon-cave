package com.johnoro.DragonCave.dao;

import com.johnoro.DragonCave.entity.Dragon;

import java.util.List;

public interface DragonDAO {
    List<Dragon> findAll();

    Object findById(int id);

    void saveOrUpdate(Dragon obj);

    void deleteById(int id);
}
