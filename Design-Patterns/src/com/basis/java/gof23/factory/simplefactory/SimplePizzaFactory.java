package com.basis.java.gof23.factory.simplefactory;

/**
 * 专门用于创建披萨的工厂类
 */
public class SimplePizzaFactory {
    public static Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        }else if("otherPizza".equals(type)){
            pizza = new OtherPizza();
        }
        return pizza;
    }
}
