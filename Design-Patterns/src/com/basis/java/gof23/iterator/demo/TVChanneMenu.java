package com.basis.java.gof23.iterator.demo;

import java.util.ArrayList;
import java.util.List;

public class TVChanneMenu implements TVMenu {

    private List<MenuItem> menuItems;

    public TVChanneMenu() {
        this.menuItems = new ArrayList<>();
        addItem(1, "CCTV-1", "This is CCTV-1");
        addItem(2, "CCTV-2", "This is CCTV-2");
        addItem(3, "CCTV-3", "This is CCTV-3");
        addItem(4, "CCTV-4", "This is CCTV-4");
        addItem(5, "CCTV-5", "This is CCTV-5");
    }

    @Override
    public void addItem(int channe, String name, String descp) {
        MenuItem menuItem = new MenuItem(channe,name,descp);
        menuItems.add(menuItem);
    }

    @Override
    public Iterator createIterator() {
        return new TVChannleIterator(menuItems);
    }
}
