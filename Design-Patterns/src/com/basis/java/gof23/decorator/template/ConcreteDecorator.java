package com.basis.java.gof23.decorator.template;

/**
 * 具体装饰类
 *
 * @author lihongjian
 * @since 2020/4/26
 */
public class ConcreteDecorator extends Decorator{


    public ConcreteDecorator(Componet componet) {
        super(componet);
    }

    @Override
    public void operate() {
        newOperate();
        super.operate();
    }

    public void newOperate(){
        System.out.println("decorator ....");
    }
}
