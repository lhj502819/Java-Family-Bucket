package com.basis.java.gof23.decorator.template;

/**
 * 具体构件
 *
 * @author lihongjian
 * @since 2020/4/26
 */
public class ConcreteComponet implements Componet{
    @Override
    public void operate() {
        System.out.println("具体构件....");
    }
}
