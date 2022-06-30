package com.johnoro.DragonCave.dao;

import com.johnoro.DragonCave.entity.Player;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class PlayerIMPL implements PlayerDAO {
    private final EntityManager entityManager;

    @Autowired
    public PlayerIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    private Session createSession() {
        return entityManager.unwrap(Session.class);
    }

    @Transactional
    public List<Player> findAll() {
        Query<Player> playerQuery = createSession().createQuery("from Player");
        return playerQuery.getResultList();
    }

    @Transactional
    public Player findById(int id) {
        return createSession().get(Player.class, id);
    }

    @Transactional
    public void saveOrUpdate(Player player) {
        createSession().saveOrUpdate(player);
    }

    @Transactional
    public void deleteById(int id) {
        Session session = createSession();
        Player player = session.get(Player.class, id);
        session.delete(player);
    }
}
