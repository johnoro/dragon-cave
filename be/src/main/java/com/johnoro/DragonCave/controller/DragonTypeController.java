package com.johnoro.DragonCave.controller;

import com.johnoro.DragonCave.entity.DragonType;
import com.johnoro.DragonCave.service.DragonTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/dragon_type")
public class DragonTypeController {
    private final DragonTypeService dragonTypeService;

    @Autowired
    public DragonTypeController(@Qualifier("dragonTypeServiceIMPL") DragonTypeService dragonTypeService) {
        this.dragonTypeService = dragonTypeService;
    }

    @GetMapping
    public List<DragonType> findAll() { return dragonTypeService.findAll(); }

    @GetMapping("/{id}")
    public Object findById(@PathVariable int id) {
        return dragonTypeService.findById(id);
    }

    @PostMapping
    public DragonType save(@RequestBody DragonType dragonType) {
        dragonType.setId(0);
        dragonTypeService.saveOrUpdate(dragonType);
        return dragonType;
    }

    @PutMapping
    public DragonType update(@RequestBody DragonType dragonType) {
        dragonTypeService.saveOrUpdate(dragonType);
        return dragonType;
    }

    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable int id) {
        dragonTypeService.deleteById(id);
        return "Deleted dragon type with id: " + id;
    }
}
