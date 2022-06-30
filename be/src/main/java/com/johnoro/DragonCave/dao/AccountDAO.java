package com.johnoro.DragonCave.dao;

import com.johnoro.DragonCave.entity.Account;

import java.util.List;

public interface AccountDAO {
    List<Account> findAll();

    Object findById(int id);

    void saveOrUpdate(Account part);

    void deleteById(int id);
}
