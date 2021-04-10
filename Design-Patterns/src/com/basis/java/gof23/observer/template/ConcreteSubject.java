package com.basis.java.gof23.observer.template;

/**
 * TODO
 *
 * @author lihongjian
 * @since 2020/4/28
 */
public class ConcreteSubject extends Subject{
    @Override
    public void notifyAllObserver() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
