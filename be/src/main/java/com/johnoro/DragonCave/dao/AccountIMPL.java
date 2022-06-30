package com.johnoro.DragonCave.dao;

import com.johnoro.DragonCave.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import java.util.List;

@Repository
public class AccountIMPL implements AccountDAO {
    private final EntityManager entityManager;

    @Autowired
    public AccountIMPL(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    private Session createSession() {
        return entityManager.unwrap(Session.class);
    }

    @Transactional
    public List<Account> findAll() {
        Query<Account> accountQuery = createSession().createQuery("from account");
        return accountQuery.getResultList();
    }

    @Transactional
    public Account findById(int id) {
        return createSession().get(Account.class, id);
    }

    @Transactional
    public void saveOrUpdate(Account account) {
        createSession().saveOrUpdate(account);
    }

    @Transactional
    public void deleteById(int id) {
        Session session = createSession();
        Account account = session.get(Account.class, id);
        session.delete(account);
    }
}
