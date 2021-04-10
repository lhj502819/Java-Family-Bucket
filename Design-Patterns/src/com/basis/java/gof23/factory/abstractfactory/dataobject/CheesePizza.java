package com.basis.java.gof23.factory.abstractfactory.dataobject;

import com.basis.java.gof23.factory.abstractfactory.factory.PizzaIngredientFactory;

public class CheesePizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory ;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        //需要NYDough、NYVeggies
        dough = pizzaIngredientFactory.createDough();
        veggies = pizzaIngredientFactory.createVeggies();
    }
}
