package com.basis.java.gof23.observer.jdkobserver;

import java.util.Observable;

/**
 * TODO
 *
 * @author lihongjian
 * @since 2020/4/28
 */
public class ConcreteObservable extends Observable {
    private  Integer i = new Integer(1);

    public void addI(){
        if(i==10){
            super.setChanged();
            notifyObservers("i等于10了");
            return;
        }
        i++;
    }
}
