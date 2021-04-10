package com.basis.java.gof23.decorator.demo;

/**
 * TODO
 *
 * @author lihongjian
 * @since 2020/4/26
 */
public class Window extends Componet{
    public Window(String name) {
        super.name = name;
    }
    @Override
    public void display() {
        System.out.println("显示窗体....");
    }
}
