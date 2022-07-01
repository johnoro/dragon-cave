package com.johnoro.DragonCave.service;

import com.johnoro.DragonCave.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();

    Object findById(int id);

    void saveOrUpdate(Account obj);

    void deleteById(int id);
}
