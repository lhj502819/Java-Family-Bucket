package com.basis.java.gof23.factory.abstractfactory;

import com.basis.java.gof23.factory.abstractfactory.dataobject.Pizza;

public class AbastractFactoryDriver {

    public static void main(String[] args) {
        PizzaStore pizzaStore = new NYPizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        pizza.prepare();
    }
}
