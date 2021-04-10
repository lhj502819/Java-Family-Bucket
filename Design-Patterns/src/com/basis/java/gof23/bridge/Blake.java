package com.basis.java.gof23.bridge;

public class Blake implements Color{
    @Override
    public void paintColor(String shape) {
        System.out.println("黑色的"+shape);
    }
}
