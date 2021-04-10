package com.basis.java.gof23.factory.factorymethod;

/**
 * 具体产品类
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "New York Cheese Pizza";
        dough = "one dough";
        sause = "辣椒酱";
        toppings.add("胡椒粉");
        toppings.add("花椒");
    }
}
