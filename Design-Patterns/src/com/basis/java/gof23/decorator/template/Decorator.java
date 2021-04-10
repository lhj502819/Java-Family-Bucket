package com.basis.java.gof23.decorator.template;

/**
 * 抽象装饰类
 *
 * @author lihongjian
 * @since 2020/4/26
 */
public abstract class Decorator implements Componet{

    private Componet componet;//维持一个对抽象构件的引用

    public Decorator(Componet componet) {
        this.componet = componet;//注入一个抽象构件类型的对象
    }

    @Override
    public void operate() {
        componet.operate();//调用原有的业务方法
    }
}
