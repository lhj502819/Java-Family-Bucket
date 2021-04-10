package com.basis.java.gof23.iterator.demo;

public class MenuItem {
    private String name;
    private String description;
    private int channe;

    public MenuItem(int channe,String name,String description){
        this.name = name;
        this.description = description;
        this.channe = channe;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getChanne() {
        return channe;
    }

    public void setChanne(int channe) {
        this.channe = channe;
    }

    @Override
    public String toString() {
        return "MenuItem{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", channe=" + channe +
                '}';
    }
}
