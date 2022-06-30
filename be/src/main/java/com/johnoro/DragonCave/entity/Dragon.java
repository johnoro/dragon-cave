package com.johnoro.DragonCave.entity;

import javax.persistence.*;

@Entity
@Table(name = "dragon")
public class Dragon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "typeId")
    private int typeId;

    @Column(name = "caveId")
    private int caveId;

    @Column(name = "name")
    private String name;

    public Dragon() {}
    public Dragon(String name, int typeId) {
        this.name = name;
        this.typeId = typeId;
    }

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getTypeId() { return typeId; }

    public void setTypeId(int type) { this.typeId = typeId; }

    public int getCaveId() {return caveId; }

    public void setCaveId(int caveId) { this.caveId = caveId; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        return "Dragon{" +
                "id=" + id +
                "type_id='" + typeId + '\'' +
                "name='" + name + '\'' +
                '}';
    }
}
