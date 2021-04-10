package com.basis.java.gof23.bridge;

public class Circle extends AbstractShape {
    @Override
    public void draw() {
        color.paintColor("圆形");
    }
}
