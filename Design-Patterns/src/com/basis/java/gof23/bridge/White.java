package com.basis.java.gof23.bridge;

public class White implements Color{
    @Override
    public void paintColor(String shape) {
        System.out.println("白色的"+shape);
    }
}
