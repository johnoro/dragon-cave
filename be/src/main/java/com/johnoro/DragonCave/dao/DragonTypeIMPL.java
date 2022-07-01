package com.johnoro.DragonCave.dao;

import com.johnoro.DragonCave.entity.DragonType;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class DragonTypeIMPL implements DragonTypeDAO {
    private final EntityManager entityManager;

    @Autowired
    public DragonTypeIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    private Session createSession() {
        return entityManager.unwrap(Session.class);
    }

    @Transactional
    public List<DragonType> findAll() {
        Query<DragonType> dragonTypeQuery = createSession().createQuery("from DragonType");
        return dragonTypeQuery.getResultList();
    }

    @Transactional
    public DragonType findById(int id) {
        return createSession().get(DragonType.class, id);
    }

    @Transactional
    public void saveOrUpdate(DragonType dragonType) {
        createSession().saveOrUpdate(dragonType);
    }

    @Transactional
    public void deleteById(int id) {
        Session session = createSession();
        DragonType dragonType = session.get(DragonType.class, id);
        session.delete(dragonType);
    }
}
