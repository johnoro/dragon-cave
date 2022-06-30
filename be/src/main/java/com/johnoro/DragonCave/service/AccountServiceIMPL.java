package com.johnoro.DragonCave.service;

import com.johnoro.DragonCave.dao.AccountDAO;
import com.johnoro.DragonCave.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountServiceIMPL implements AccountService {
    private final AccountDAO accountDAO;

    @Autowired
    public AccountServiceIMPL(AccountDAO accountDAO) { this.accountDAO = accountDAO; }

    public List<Account> findAll() { return accountDAO.findAll(); }

    public Object findById(int accountId) { return accountDAO.findById(accountId); }

    public void saveOrUpdate(Account account) { accountDAO.saveOrUpdate(account); }

    public void deleteById(int accountId) { accountDAO.deleteById(accountId); }
}
