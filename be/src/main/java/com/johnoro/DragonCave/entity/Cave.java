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

    public Cave() { }

    public Cave(String name) {
        this.name = name;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Cave{" +
               "id=" + id +
               "name='" + name + '\'' +
               '}';
    }
}
