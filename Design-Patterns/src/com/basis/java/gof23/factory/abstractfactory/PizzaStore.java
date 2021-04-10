package com.basis.java.gof23.factory.abstractfactory;

import com.basis.java.gof23.factory.abstractfactory.dataobject.Pizza;


public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
