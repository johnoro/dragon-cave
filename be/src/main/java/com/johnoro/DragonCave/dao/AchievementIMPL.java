package com.johnoro.DragonCave.dao;

import com.johnoro.DragonCave.entity.Achievement;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class AchievementIMPL implements AchievementDAO {
    private final EntityManager entityManager;

    @Autowired
    public AchievementIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    private Session createSession() {
        return entityManager.unwrap(Session.class);
    }

    @Transactional
    public List<Achievement> findAll() {
        Query<Achievement> achievementQuery = createSession().createQuery("from Achievement");
        return achievementQuery.getResultList();
    }

    @Transactional
    public Achievement findById(int id) {
        return createSession().get(Achievement.class, id);
    }

    @Transactional
    public void saveOrUpdate(Achievement achievement) {
        createSession().saveOrUpdate(achievement);
    }

    @Transactional
    public void deleteById(int id) {
        Session session = createSession();
        Achievement achievement = session.get(Achievement.class, id);
        session.delete(achievement);
    }
}
