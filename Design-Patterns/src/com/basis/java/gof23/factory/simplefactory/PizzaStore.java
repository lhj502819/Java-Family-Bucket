package com.basis.java.gof23.factory.simplefactory;

/**
 * 披萨商店类
 */
public class PizzaStore {
    public Pizza orderPizza(String type){
        return SimplePizzaFactory.createPizza("cheese");
    }
}
