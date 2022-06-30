package com.johnoro.DragonCave.dao;

import com.johnoro.DragonCave.entity.Achievement;

import java.util.List;

public interface AchievementDAO {
    List<Achievement> findAll();

    Object findById(int id);

    void saveOrUpdate(Achievement part);

    void deleteById(int id);
}
