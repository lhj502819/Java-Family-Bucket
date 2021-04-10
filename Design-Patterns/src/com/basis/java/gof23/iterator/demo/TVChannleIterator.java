package com.basis.java.gof23.iterator.demo;

import java.util.List;

public class TVChannleIterator implements Iterator {

    private List<MenuItem> menuItems;

    private int positon = 0;

    public TVChannleIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hashNext() {
        if (positon == menuItems.size())
            return false;
        return true;
    }

    @Override
    public Object next() {
        if (hashNext()) {
            MenuItem menuItem = menuItems.get(positon);
            positon++;
            return menuItem;
        }
        throw new RuntimeException();
    }
}
