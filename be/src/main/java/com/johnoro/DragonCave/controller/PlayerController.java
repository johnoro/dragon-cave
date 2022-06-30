package com.johnoro.DragonCave.controller;

import com.johnoro.DragonCave.entity.Player;
import com.johnoro.DragonCave.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/player")
public class PlayerController {
    private final PlayerService playerService;

    @Autowired
    public PlayerController(@Qualifier("playerServiceIMPL")PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public List<Player> findAll() { return playerService.findAll(); }

    @GetMapping("/{id}")
    public Object findById(@PathVariable int id) {
        return playerService.findById(id);
    }

    @PostMapping
    public Player save(@RequestBody Player player) {
        player.setId(0);
        playerService.saveOrUpdate(player);
        return player;
    }

    @PutMapping
    public Player update(@RequestBody Player player) {
        playerService.saveOrUpdate(player);
        return player;
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id) {
        playerService.deleteById(id);
        return "Deleted player with id: " + id;
    }
}