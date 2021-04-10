package com.basis.java.gof23.iterator.demo;

public class Client {
    public static void main(String[] args) {
        FileMenu fileMenu = new FileMenu();

        TVChanneMenu tvChanneMenu = new TVChanneMenu();

        tvChanneMenu.addItem(10,"CCTV-10","走近科学");
        MainMenu mainMenu = new MainMenu(tvChanneMenu,fileMenu);

        mainMenu.print();
    }
}
