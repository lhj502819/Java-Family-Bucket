package com.basis.java.gof23.facade.demo2;

public class WatchTVFacade2 extends AbastractWatchTvFacade{
    private Light light;
    private Screen screen;
    private TV tv;
    private Air air;

    public WatchTVFacade2() {
        this.light = new Light();
        this.screen = new Screen();
        this.tv = new TV();
        this.air = new Air();
    }

    @Override
    public void watchTV() {
        light.open();
        air.open();
        screen.down();
        tv.open();
    }
}
