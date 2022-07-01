package com.johnoro.DragonCave.dao;

import com.johnoro.DragonCave.entity.Cave;

import java.util.List;

public interface CaveDAO {
    List<Cave> findAll();

    Object findById(int id);

    void saveOrUpdate(Cave obj);

    void deleteById(int id);
}
