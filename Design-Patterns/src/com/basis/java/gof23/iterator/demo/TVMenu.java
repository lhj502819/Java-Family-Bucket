package com.basis.java.gof23.iterator.demo;

public interface TVMenu {
    void addItem(int channe,String name,String descp);

    Iterator createIterator();
}
