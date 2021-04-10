package com.basis.java.gof23.bridge;

public class Square extends AbstractShape{
    @Override
    public void draw() {
        color.paintColor("正方形");
    }
}
