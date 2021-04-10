package com.basis.java.gof23.decorator.demo;

/**
 * TODO
 *
 * @author lihongjian
 * @since 2020/4/26
 */
public class ZoomDecorator extends ComponetDecorator{

    public ZoomDecorator(Componet componet) {
        super(componet);
    }

    @Override
    public void display() {
        super.display();
        zoomOut();
    }
    public void zoomOut(){
        String format = String.format("构件%s缩小", super.componet.name);
        System.out.println(format);
    }
}
