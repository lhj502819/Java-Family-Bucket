package com.basis.java.gof23.iterator.demo;


public class FileMenuIterator implements Iterator{

    MenuItem[] menuItems ;

    private int position = 0;

    public FileMenuIterator(MenuItem[] menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hashNext() {
        if(position==menuItems.length)
            return false;
        return true;
    }

    @Override
    public Object next() {
        if(hashNext()){
            MenuItem menuItem = menuItems[position];
            position++;
            return menuItem;
        }
        throw new RuntimeException("到头了");
    }
}
