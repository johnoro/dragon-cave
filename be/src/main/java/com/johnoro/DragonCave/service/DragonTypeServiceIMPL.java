package com.johnoro.DragonCave.service;

import com.johnoro.DragonCave.dao.DragonTypeDAO;
import com.johnoro.DragonCave.entity.DragonType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DragonTypeServiceIMPL implements DragonTypeService {
    private final DragonTypeDAO dragonTypeDAO;

    @Autowired
    public DragonTypeServiceIMPL(DragonTypeDAO dragonTypeDAO) { this.dragonTypeDAO = dragonTypeDAO; }

    public List<DragonType> findAll() { return dragonTypeDAO.findAll(); }

    public Object findById(int id) { return dragonTypeDAO.findById(id); }

    public void saveOrUpdate(DragonType dragonType) { dragonTypeDAO.saveOrUpdate(dragonType); }

    public void deleteById(int id) { dragonTypeDAO.deleteById(id); }
}
