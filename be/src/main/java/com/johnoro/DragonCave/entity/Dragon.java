package com.johnoro.DragonCave.entity;

import javax.persistence.*;

@Entity
@Table(name = "dragon")
public class Dragon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}
