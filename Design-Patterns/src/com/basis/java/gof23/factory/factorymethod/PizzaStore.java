package com.basis.java.gof23.factory.factorymethod;

/**
 * 抽象工厂
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        Pizza pizza ;
        pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
