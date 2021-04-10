package com.basis.java.gof23.decorator.demo;

/**
 * Clinet
 *
 * @author lihongjian
 * @since 2020/4/26
 */
public class DecoratorClient {
    public static void main(String[] args) {
        Componet componet = new ListBox("列表框");
        ComponetDecorator scrollBarDecorator = new ScrollBarDecorator(componet);
        //此处可以对已经装饰过来的ScrollBarDecorator，再次进行装饰，应为都为Componet的子类，此处为关键
        ComponetDecorator zoomDecorator = new ZoomDecorator(scrollBarDecorator);
        zoomDecorator.display();
    }
}
