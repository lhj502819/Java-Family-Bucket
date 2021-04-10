package com.basis.java.gof23.strategy.template;

public class Clinet {
    public static void main(String[] args) {
        ConcreteStrategy concreteStrategy = new ConcreteStrategy();
        Context context = new Context(concreteStrategy);
        context.doAnything("param");
    }
}
