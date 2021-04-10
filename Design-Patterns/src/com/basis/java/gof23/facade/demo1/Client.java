package com.basis.java.gof23.facade.demo1;

/**
 * 客户类
 */
public class Client {
    public static void main(String[] args) {
        WatchTVFacade watchTVFacade = new WatchTVFacade();
        watchTVFacade.watchTV();
    }

}
