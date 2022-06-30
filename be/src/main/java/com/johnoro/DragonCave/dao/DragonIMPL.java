package com.johnoro.DragonCave.dao;

import com.johnoro.DragonCave.entity.Dragon;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class DragonIMPL implements DragonDAO {
    private final EntityManager entityManager;

    @Autowired
    public DragonIMPL(EntityManager entityManager) { this.entityManager = entityManager; }

    private Session createSession() { return entityManager.unwrap(Session.class); }

    @Transactional
    public List<Dragon> findAll() {
        Query<Dragon> dragonQuery = createSession().createQuery("from Dragon");
        return dragonQuery.getResultList();
    }

    @Transactional
    public Dragon findById(int id) { return createSession().get(Dragon.class, id); }

    @Transactional
    public void saveOrUpdate(Dragon dragon) { createSession().saveOrUpdate(dragon); }

    @Transactional
    public void deleteById(int id) {
        Session session = createSession();
        Dragon dragon = session.get(Dragon.class, id);
        session.delete(dragon);
    }
}
