package com.johnoro.DragonCave.service;

import com.johnoro.DragonCave.dao.AchievementDAO;
import com.johnoro.DragonCave.entity.Achievement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AchievementServiceIMPL implements AchievementService {
    private final AchievementDAO achievementDAO;

    @Autowired
    public AchievementServiceIMPL(AchievementDAO achievementDAO) {
        this.achievementDAO = achievementDAO;
    }

    public List<Achievement> findAll() { return achievementDAO.findAll(); }

    public Object findById(int achievementId) { return achievementDAO.findById(achievementId); }

    public void saveOrUpdate(Achievement achievement) { achievementDAO.saveOrUpdate(achievement); }

    public void deleteById(int achievementId) { achievementDAO.deleteById(achievementId); }
}
