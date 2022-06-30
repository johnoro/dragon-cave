package com.johnoro.DragonCave.service;

import com.johnoro.DragonCave.entity.Dragon;

import java.util.List;

public interface DragonService {
    List<Dragon> findAll();

    Object findById(int id);

    void saveOrUpdate(Dragon dragon);

    void deleteById(int id);
}
