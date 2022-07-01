package com.johnoro.DragonCave.service;

import com.johnoro.DragonCave.dao.PlayerDAO;
import com.johnoro.DragonCave.entity.Player;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlayerServiceIMPL implements PlayerService {
    private final PlayerDAO playerDAO;

    @Autowired
    public PlayerServiceIMPL(PlayerDAO playerDAO) { this.playerDAO = playerDAO; }

    public List<Player> findAll() { return playerDAO.findAll(); }

    public Object findById(int playerId) { return playerDAO.findById(playerId); }

    public void saveOrUpdate(Player player) { playerDAO.saveOrUpdate(player); }

    public void deleteById(int playerId) { playerDAO.deleteById(playerId); }
}
