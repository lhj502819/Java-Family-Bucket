package com.basis.java.gof23.bridge;

public class Yellow implements Color{
    @Override
    public void paintColor(String shape) {
        System.out.println("黄色的"+shape);
    }
}
