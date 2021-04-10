package com.basis.java.gof23.iterator.demo;

public class MainMenu {
    private TVChanneMenu tvChanneMenu;

    private FileMenu fileMenu;


    public MainMenu(TVChanneMenu tvChanneMenu, FileMenu fileMenu) {
        this.tvChanneMenu = tvChanneMenu;
        this.fileMenu = fileMenu;
    }

    public void print(){
        Iterator iterator = tvChanneMenu.createIterator();
        Iterator iterator1 = fileMenu.createIterator();
        System.out.println("---电视节目-----");
        print(iterator);
        System.out.println("---电影节目-----");
        print(iterator1);
    }

    private void print(Iterator iterator){
        while (iterator.hashNext()){
            MenuItem next = (MenuItem) iterator.next();
            System.out.println(next);
        }
    }
}
