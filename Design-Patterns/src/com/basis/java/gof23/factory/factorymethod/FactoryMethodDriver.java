package com.basis.java.gof23.factory.factorymethod;

public class FactoryMethodDriver {
    public static void main(String[] args) {
        System.out.println("---------Joel 需要的纽约风味的披萨---------");
        PizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza joelPizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + joelPizza.getName() + "\n");

        System.out.println("---------Ethan 需要的中国风味的披萨---------");
        nyPizzaStore = new ChinaPizzaStore();
        Pizza ethanPizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + ethanPizza.getName() + "\n");
    }
}
