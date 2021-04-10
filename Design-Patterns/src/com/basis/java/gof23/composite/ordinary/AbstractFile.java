package com.basis.java.gof23.composite.ordinary;

public abstract class AbstractFile {
    //组件名称
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void add(AbstractFile abstractFile);

    abstract void remove(AbstractFile abstractFile);

    abstract AbstractFile getChild(int i);

    abstract void display();
}
