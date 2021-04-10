package com.basis.java.gof23.factory.factorymethod;

public class ChinaPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if("cheese".equals(type)){
            pizza = new ChStyleCheesePizza();
        }/*else if(){

        }*/
        return pizza;
    }
}
