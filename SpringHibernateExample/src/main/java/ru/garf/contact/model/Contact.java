package ru.garf.contact.model;

import java.io.Serializable;


public class Contact implements Serializable{

    private static final long serialVersionUID = 1L;

    private Long id;
    private String name;
    private String secName;
    private Long mob;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecName() {
        return secName;
    }

    public void setSecName(String secName) {
        this.secName = secName;
    }

    public Long getMob() {
        return mob;
    }

    public void setMob(Long mob) {
        this.mob = mob;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Id = ").append(id).append(" - ");
        sb.append("Name = ").append(name).append(" - ");
        sb.append("SecName = ").append(secName).append(" - ");
        sb.append("Mob = ").append(mob);

        return sb.toString();

    }
}
