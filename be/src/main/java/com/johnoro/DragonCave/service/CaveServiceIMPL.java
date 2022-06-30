package com.johnoro.DragonCave.service;

import com.johnoro.DragonCave.dao.CaveDAO;
import com.johnoro.DragonCave.entity.Cave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CaveServiceIMPL implements CaveService {
    private final CaveDAO caveDAO;

    @Autowired
    public CaveServiceIMPL(CaveDAO caveDAO) { this.caveDAO = caveDAO; }

    public List<Cave> findAll() { return caveDAO.findAll(); }

    public Object findById(int caveId) { return caveDAO.findById(caveId); }

    public void saveOrUpdate(Cave cave) { caveDAO.saveOrUpdate(cave); }

    public void deleteById(int caveId) { caveDAO.deleteById(caveId); }
}
