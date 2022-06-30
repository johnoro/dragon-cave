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

    @Override
    public String toString() {
        return "Dragon{" +
                "id=" + id +
                "accountId='" + accountId + '\'' +
                "name='" + name + '\'' +
                '}';
    }
}
