package com.basis.java.gof23.factory.abstractfactory.factory;

import com.basis.java.gof23.factory.abstractfactory.ingredient.*;
import com.basis.java.gof23.factory.abstractfactory.ingredient.ch.*;

public class CHPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new CHDough();
    }

    @Override
    public Sauce createSauce() {
        return new CHSauce();
    }

    @Override
    public Clams createClams() {
        return new CHClams();
    }

    @Override
    public Cheese createCheese() {
        return new CHCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new CHPerpperoni();
    }

    @Override
    public Veggies createVeggies() {
        return new CHVeggies();
    }
}
