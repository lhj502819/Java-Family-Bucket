package com.basis.java.gof23.strategy.template;

public class Context {
    public final Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAnything(Object param){
        this.strategy.doSomething(param);
    }
}
