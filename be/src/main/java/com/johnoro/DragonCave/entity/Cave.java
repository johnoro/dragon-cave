package com.johnoro.DragonCave.entity;

import javax.persistence.*;

@Entity
@Table(name = "cave")
public class Cave {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;
}
