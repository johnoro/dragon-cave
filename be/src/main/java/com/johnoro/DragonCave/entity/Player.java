package com.johnoro.DragonCave.entity;

import javax.persistence.*;

@Entity
@Table(name = "player")
public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "account_id")
    private int accountId;

    @Column(name = "name")
    private String name;

    public Player() {}

    public Player(int accountId, String name) {
        this.accountId = accountId;
        this.name = name;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getAccountId() { return accountId; }

    public void setAccountId(int accountId) { this.accountId = accountId; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Dragon{" +
                "id=" + id +
                "accountId='" + accountId + '\'' +
                "name='" + name + '\'' +
                '}';
    }
}
