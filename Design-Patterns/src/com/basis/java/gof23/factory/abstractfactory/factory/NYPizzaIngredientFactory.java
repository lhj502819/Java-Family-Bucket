package com.basis.java.gof23.factory.abstractfactory.factory;

import com.basis.java.gof23.factory.abstractfactory.ingredient.*;
import com.basis.java.gof23.factory.abstractfactory.ingredient.ny.*;

/**
 * 纽约原料工厂
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {

        return new NYDough();
    }

    @Override
    public Sauce createSauce() {
        return new NYSauce();
    }

    @Override
    public Clams createClams() {
        return new NYClams();
    }

    @Override
    public Cheese createCheese() {
        return new NYCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        return new NYPerpperoni();
    }

    @Override
    public Veggies createVeggies() {
        return new NYVeggies();
    }
}
