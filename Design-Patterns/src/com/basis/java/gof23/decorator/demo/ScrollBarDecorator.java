package com.basis.java.gof23.decorator.demo;

/**
 * TODO
 *
 * @author lihongjian
 * @since 2020/4/26
 */
public class ScrollBarDecorator extends ComponetDecorator{
    public ScrollBarDecorator(Componet componet) {
        super(componet);
    }

    @Override
    public void display() {
        scroll();
        super.display();
    }

    public void scroll(){
        String format = String.format("为构件%S增加滚动条", super.componet.name);
        System.out.println(format);
    }
}
