package com.basis.java.gof23.observer.jdkobserver;

import java.util.Observable;
import java.util.Observer;

/**
 * TODO
 *
 * @author lihongjian
 * @since 2020/4/28
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("观察者收到了："+(String)arg);
    }
}
