package com.johnoro.DragonCave.entity;

import javax.persistence.*;

@Entity
@Table(name = "dragon_type")
public class DragonType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    public DragonType() {}

    public DragonType(String name) { this.name = name; }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }
}
