package com.basis.java.gof23.decorator.demo;

/**
 * TODO
 *
 * @author lihongjian
 * @since 2020/4/26
 */
public class BlackllBarDecorator extends ComponetDecorator{
    public BlackllBarDecorator(Componet componet) {
        super(componet);
    }

    @Override
    public void display() {
        scroll();
        super.display();
    }

    public void scroll(){
        String format = String.format("为构件%s增加黑色边框", super.componet.name);
        System.out.println(format);
    }
}
