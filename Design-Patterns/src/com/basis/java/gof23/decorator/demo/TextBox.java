package com.basis.java.gof23.decorator.demo;

/**
 * TODO
 *
 * @author lihongjian
 * @since 2020/4/26
 */
public class TextBox extends Componet{
    public TextBox(String name) {
        super.name = name;
    }
    @Override
    public void display() {
        System.out.println("显示文本框");
    }
}
