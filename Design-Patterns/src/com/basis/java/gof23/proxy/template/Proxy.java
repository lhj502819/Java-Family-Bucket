package com.basis.java.gof23.proxy.template;

/**
 * 代理主题类
 */
public class Proxy extends Subject {

    private RealSubject realSubject;

    public Proxy() {
        this.realSubject = new RealSubject();
    }

    @Override
    public void request() {
        preRequest();

        realSubject.request();

        afterRequest();
    }

    public void preRequest(){

    }
    public void afterRequest(){

    }
}
