package com.basis.java.gof23.factory.simplefactory;

/**
 * 披萨抽象类
 */
public abstract class Pizza {

    //定义抽象方法
    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();
}
