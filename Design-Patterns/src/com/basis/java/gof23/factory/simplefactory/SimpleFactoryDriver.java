package com.basis.java.gof23.factory.simplefactory;

/**
 * 简单工厂模式
 * @author 李宏健
 * @since 2020-4-24
 */
public class SimpleFactoryDriver {

    /**
     * 模式场景：在一个披萨店中，要根据用户的不同口味生成不同的披萨：素食披萨、希腊披萨等
     */
    public static void main(String[] args) {
        PizzaStore pizzaStore = new PizzaStore();
        Pizza pizza = pizzaStore.orderPizza("cheese");
        pizza.prepare();
        pizza.bake();
        pizza.box();
        pizza.cut();
    }

}
