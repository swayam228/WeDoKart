package com.example.wedokart.model;

public class Catagory {

    private String name, icon, color, breif;
    private int id;

    public Catagory(String name, String icon, String color, String breif, int id) {
        this.name = name;
        this.icon = icon;
        this.color = color;
        this.breif = breif;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBreif() {
        return breif;
    }

    public void setBreif(String breif) {
        this.breif = breif;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
