package com.basis.java.gof23.bridge;

/**
 * 形状抽象类，主要提供画形状的方法，并将画形状和颜色桥接过来
 */
public abstract class AbstractShape {

    Color color;

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract void draw();
}
