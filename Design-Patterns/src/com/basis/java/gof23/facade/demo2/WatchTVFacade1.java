package com.basis.java.gof23.facade.demo2;

public class WatchTVFacade1 extends AbastractWatchTvFacade{
    private Light light;
    private Screen screen;
    private TV tv;

    public WatchTVFacade1() {
        this.light = new Light();
        this.screen = new Screen();
        this.tv = new TV();
    }

    @Override
    public void watchTV() {
        light.open();
        screen.down();
        tv.open();
    }
}
