package com.johnoro.DragonCave.controller;

import com.johnoro.DragonCave.entity.Achievement;
import com.johnoro.DragonCave.service.AchievementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/achievement")
public class AchievementController {
    private final AchievementService achievementService;

    @Autowired
    public AchievementController(@Qualifier("achievementServiceIMPL")AchievementService achievementService) {
        this.achievementService = achievementService;
    }

    @GetMapping
    public List<Achievement> findAll() { return achievementService.findAll(); }

    @GetMapping("/{id}")
    public Object findById(@PathVariable int id) {
        return achievementService.findById(id);
    }

    @PostMapping
    public Achievement save(@RequestBody Achievement achievement) {
        achievement.setId(0);
        achievementService.saveOrUpdate(achievement);
        return achievement;
    }

    @PutMapping
    public Achievement update(@RequestBody Achievement achievement) {
        achievementService.saveOrUpdate(achievement);
        return achievement;
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id) {
        achievementService.deleteById(id);
        return "Deleted achievement with id: " + id;
    }
}
