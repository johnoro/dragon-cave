package com.johnoro.DragonCave.service;

import com.johnoro.DragonCave.entity.Cave;

import java.util.List;

public interface CaveService {
    List<Cave> findAll();

    Object findById(int id);

    void saveOrUpdate(Cave cave);

    void deleteById(int id);
}
