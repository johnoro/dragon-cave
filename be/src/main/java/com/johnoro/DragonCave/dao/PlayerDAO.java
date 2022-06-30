package com.johnoro.DragonCave.dao;

import com.johnoro.DragonCave.entity.Player;

import java.util.List;

public interface PlayerDAO {
    List<Player> findAll();

    Object findById(int id);

    void saveOrUpdate(Player part);

    void deleteById(int id);
}
