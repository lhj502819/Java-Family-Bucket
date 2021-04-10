package com.basis.java.gof23.factory.factorymethod;

/**
 * 具体产品类
 */
public class ChStyleCheesePizza extends Pizza {
    public ChStyleCheesePizza() {
        name = "China Cheese Pizza";
        dough = "one dough";
        sause = "甜面酱";
        toppings.add("十三香");
        toppings.add("花生油");
    }
}
