package com.basis.java.gof23.facade.demo1;

/**
 * 外观类
 */
public class WatchTVFacade {
    //持有子系统的引用
    private Light light;
    private TV tv;
    private Screen screen;

    public WatchTVFacade() {
        this.light = new Light();
        this.tv = new TV();
        this.screen = new Screen();
    }

    public void watchTV(){
        light.open();
        screen.down();
        tv.open();
    }

}
