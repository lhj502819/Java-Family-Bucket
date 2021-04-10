package com.basis.java.gof23.observer.demo;

/**
 * TODO
 *
 * @author lihongjian
 * @since 2020/4/28
 */
public interface Observer {
    public String getName();

    public void setName(String name);

    public void help();//声明支援盟友方法

    public void beAttacked(AllyConterCenter allConterCenter);//声明遭受打击方法
}
