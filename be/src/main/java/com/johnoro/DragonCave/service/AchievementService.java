package com.johnoro.DragonCave.service;

import com.johnoro.DragonCave.entity.Achievement;

import java.util.List;

public interface AchievementService {
    List<Achievement> findAll();

    Object findById(int id);

    void saveOrUpdate(Achievement obj);

    void deleteById(int id);
}
