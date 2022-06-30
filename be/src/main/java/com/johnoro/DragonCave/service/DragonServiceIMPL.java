package com.johnoro.DragonCave.service;

import com.johnoro.DragonCave.dao.DragonDAO;
import com.johnoro.DragonCave.entity.Dragon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DragonServiceIMPL implements DragonService {
    private final DragonDAO dragonDAO;

    @Autowired
    public DragonServiceIMPL(DragonDAO dragonDAO) { this.dragonDAO = dragonDAO; }

    public List<Dragon> findAll() { return dragonDAO.findAll(); }

    public Object findById(int dragonId) { return dragonDAO.findById(dragonId); }

    public void saveOrUpdate(Dragon dragon) { dragonDAO.saveOrUpdate(dragon); }

    public void deleteById(int dragonId) { dragonDAO.deleteById(dragonId); }
}
