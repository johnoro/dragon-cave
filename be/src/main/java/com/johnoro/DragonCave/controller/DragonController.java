package com.johnoro.DragonCave.controller;

import com.johnoro.DragonCave.entity.Dragon;
import com.johnoro.DragonCave.service.DragonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/dragon")
public class DragonController {
    private final DragonService dragonService;

    @Autowired
    public DragonController(@Qualifier("dragonServiceIMPL")DragonService dragonService) {
        this.dragonService = dragonService;
    }

    @GetMapping
    public List<Dragon> findAll() { return dragonService.findAll(); }

    @GetMapping("/{id}")
    public Object findById(@PathVariable int id) {
        return dragonService.findById(id);
    }

    @PostMapping
    public Dragon save(@RequestBody Dragon dragon) {
        dragon.setId(0);
        dragonService.saveOrUpdate(dragon);
        return dragon;
    }

    @PutMapping
    public Dragon update(@RequestBody Dragon dragon) {
        dragonService.saveOrUpdate(dragon);
        return dragon;
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id) {
        dragonService.deleteById(id);
        return "Deleted dragon with id: " + id;
    }
}
