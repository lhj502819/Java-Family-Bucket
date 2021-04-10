package com.basis.java.gof23.singleton;

/**
 * 饿汉式单例模式
 *
 * @author lihongjian
 * @since 2020/4/24
 */
public class HungrySingleton {
    //创建类之后就创建对象
    private static HungrySingleton singleton = new HungrySingleton();

    private HungrySingleton(){

    }

    public static HungrySingleton getInstance(){
        return singleton;
    }

}
