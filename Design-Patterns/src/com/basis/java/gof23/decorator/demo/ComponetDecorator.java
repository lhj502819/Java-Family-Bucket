package com.basis.java.gof23.decorator.demo;

/**
 * TODO
 *
 * @author lihongjian
 * @since 2020/4/26
 */
public abstract class ComponetDecorator extends Componet{

    public Componet componet;

    public ComponetDecorator(Componet componet) {
        this.componet = componet;
    }

    @Override
    public void display() {
        componet.display();
    }
}
