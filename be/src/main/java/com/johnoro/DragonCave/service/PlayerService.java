package com.johnoro.DragonCave.service;

import com.johnoro.DragonCave.entity.Player;

import java.util.List;

public interface PlayerService {
    List<Player> findAll();

    Object findById(int id);

    void saveOrUpdate(Player obj);

    void deleteById(int id);
}
