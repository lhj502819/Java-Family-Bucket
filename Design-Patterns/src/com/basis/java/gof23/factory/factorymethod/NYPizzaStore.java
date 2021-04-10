package com.basis.java.gof23.factory.factorymethod;

public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new  NYStyleCheesePizza();
        }/*else if(){

        }*/
        return pizza;
    }
}
