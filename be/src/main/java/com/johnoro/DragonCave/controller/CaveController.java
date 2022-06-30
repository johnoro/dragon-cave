package com.johnoro.DragonCave.controller;

import com.johnoro.DragonCave.entity.Cave;
import com.johnoro.DragonCave.service.CaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/cave")
public class CaveController {
    private final CaveService caveService;

    @Autowired
    public CaveController(@Qualifier("caveServiceIMPL") CaveService caveService) {
        this.caveService = caveService;
    }

    @GetMapping
    public List<Cave> findAll() { return caveService.findAll(); }

    @GetMapping("/{id}")
    public Object findById(@PathVariable int id) {
        return caveService.findById(id);
    }

    @PostMapping
    public Cave save(@RequestBody Cave cave) {
        cave.setId(0);
        caveService.saveOrUpdate(cave);
        return cave;
    }

    @PutMapping
    public Cave update(@RequestBody Cave cave) {
        caveService.saveOrUpdate(cave);
        return cave;
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id) {
        caveService.deleteById(id);
        return "Deleted cave with id: " + id;
    }
}
