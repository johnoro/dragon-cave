package com.johnoro.DragonCave.controller;

import com.johnoro.DragonCave.entity.Account;
import com.johnoro.DragonCave.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000" })
@RestController
@RequestMapping("/api/account")
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(@Qualifier("accountServiceIMPL")AccountService accountService) {
        this.accountService = accountService;
    }

    @GetMapping
    public List<Account> findAll() { return accountService.findAll(); }

    @GetMapping("/{accountId}")
    public Object findById(@PathVariable int accountId) {
        return accountService.findById(accountId);
    }

    @PostMapping
    public Account saveAccount(@RequestBody Account account) {
        account.setId(0);
        accountService.saveOrUpdate(account);
        return account;
    }

    @PutMapping
    public Account updateAccount(@RequestBody Account account) {
        accountService.saveOrUpdate(account);
        return account;
    }

    @DeleteMapping("/{accountId}")
    public String deleteById(@PathVariable int accountId) {
        accountService.deleteById(accountId);
        return "Deleted account with id: " + accountId;
    }
}
