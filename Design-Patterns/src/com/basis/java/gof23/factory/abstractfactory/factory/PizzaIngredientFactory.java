package com.basis.java.gof23.factory.abstractfactory.factory;

import com.basis.java.gof23.factory.abstractfactory.ingredient.*;

/**
 * 抽象原料创建工厂
 */
public interface PizzaIngredientFactory {
    /**
     * 在接口中，每一个原料都由一个对应的方法创建该原料
     */
    //面团
    public Dough createDough();

    //调味汁; 酱
    public Sauce createSauce();

    //蛤蜊
    public Clams createClams();

    //干酪; 奶酪;
    public Cheese createCheese();

    //意大利辣肉肠;
    public Pepperoni createPepperoni();

    //蔬菜
    public Veggies createVeggies();

}
