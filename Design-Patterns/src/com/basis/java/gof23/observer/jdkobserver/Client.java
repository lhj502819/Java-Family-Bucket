package com.basis.java.gof23.observer.jdkobserver;

/**
 * TODO
 *
 * @author lihongjian
 * @since 2020/4/28
 */
public class Client {
    public static void main(String[] args) {
        ConcreteObservable concreteObservable = new ConcreteObservable();
        concreteObservable.addObserver(new ConcreteObserver());
        for(int i = 0 ;i<11;i++){
            concreteObservable.addI();
        }
    }
}
