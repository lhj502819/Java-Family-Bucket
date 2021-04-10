package com.basis.java.gof23.factory.abstractfactory.dataobject;

import com.basis.java.gof23.factory.abstractfactory.ingredient.*;

public abstract class Pizza {
    /**
     * 每个披萨都持有一组在准备时会用到的原料
     */
    String name;

    Dough dough;

    Cheese cheese;

    Clams clams;

    Pepperoni pepperoni;

    Sauce sauce;

    Veggies veggies;

    /**
     * prepare()方法声明为抽象方法。在这个方法中，在这个方法中我们需要收集不同披萨所需的原料，原料来自不同的原料工厂
     */
    public abstract void prepare();

    public void bake() {
        System.out.println("Bake for 25 munites at 350");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
