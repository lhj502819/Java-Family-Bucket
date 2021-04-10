package com.basis.java.gof23.factory.abstractfactory;

import com.basis.java.gof23.factory.abstractfactory.dataobject.CheesePizza;
import com.basis.java.gof23.factory.abstractfactory.dataobject.Pizza;
import com.basis.java.gof23.factory.abstractfactory.factory.NYPizzaIngredientFactory;

/**
 *在披萨店中，我们依然需要关注原料，当地的披萨店需要和本地的原料工厂关联起来。
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        NYPizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if("cheese".equals(type)){
            pizza = new CheesePizza(ingredientFactory);
        }/*else if(){

        }*/
        return pizza;
    }
}
