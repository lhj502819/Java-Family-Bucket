package com.basis.java.gof23.observer.demo;

import java.util.ArrayList;
import java.util.List;

/**
 * 战队控制中心类：目标类
 *
 * @author lihongjian
 * @since 2020/4/28
 */
public abstract class AllyConterCenter {

    protected String allyName;//战队名称
    protected List<Observer> players;//定义一个集合用于存储战队成员

    public AllyConterCenter() {
        this.players = new ArrayList<>();
    }

    public String getAllyName() {
        return allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }
    //注册方法
    public void join(Observer observer){
        System.out.println(observer.getName()+"加入战队"+allyName);
        players.add(observer);
    }
    //离开战队
    public void qiut(Observer observer){
        System.out.println(observer.getName()+"离开战队"+allyName);
        players.remove(observer);
    }

    //声明抽象通知方法
    public abstract void notyfyAllPlayers(String name);
}
