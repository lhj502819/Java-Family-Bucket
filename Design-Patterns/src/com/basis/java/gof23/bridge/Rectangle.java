package com.basis.java.gof23.bridge;

public class Rectangle extends AbstractShape{
    @Override
    public void draw() {
        color.paintColor("长方形");
    }
}
