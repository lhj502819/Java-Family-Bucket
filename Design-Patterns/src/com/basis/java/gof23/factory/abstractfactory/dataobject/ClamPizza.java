package com.basis.java.gof23.factory.abstractfactory.dataobject;

import com.basis.java.gof23.factory.abstractfactory.factory.PizzaIngredientFactory;

public class ClamPizza extends Pizza{

    PizzaIngredientFactory ingredientFactory;

    public ClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        //需要中国Clam
        dough = ingredientFactory.createDough();
        clams = ingredientFactory.createClams();
    }
}
