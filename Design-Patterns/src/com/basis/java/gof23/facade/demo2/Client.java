package com.basis.java.gof23.facade.demo2;


/**
 * 客户类
 */
public class Client {
    public static void main(String[] args) {
        AbastractWatchTvFacade watchTVFacade = new WatchTVFacade2();//可以通过传参的形式将具体实现进行赋值
        watchTVFacade.watchTV();
    }
}
