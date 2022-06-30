package com.johnoro.DragonCave.dao;

import com.johnoro.DragonCave.entity.Cave;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class CaveIMPL implements CaveDAO {
    private final EntityManager entityManager;

    @Autowired
    public CaveIMPL(EntityManager entityManager) { this.entityManager = entityManager; }

    private Session createSession() { return entityManager.unwrap(Session.class); }

    @Transactional
    public List<Cave> findAll() {
        Query<Cave> caveQuery = createSession().createQuery("from Cave");
        return caveQuery.getResultList();
    }

    @Transactional
    public Cave findById(int id) { return createSession().get(Cave.class, id); }

    @Transactional
    public void saveOrUpdate(Cave cave) { createSession().saveOrUpdate(cave); }

    @Transactional
    public void deleteById(int id) {
        Session session = createSession();
        Cave cave = session.get(Cave.class, id);
        session.delete(cave);
    }
}
