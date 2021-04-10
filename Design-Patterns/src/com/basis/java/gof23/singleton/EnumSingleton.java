package com.basis.java.gof23.singleton;

import java.lang.reflect.Constructor;

/**
 * 枚举实现单例设计模式
 *
 * @author lihongjian
 * @since 2020/4/25
 */
public enum  EnumSingleton {
    INSTANCE;
    public EnumSingleton getInstance(){
        return INSTANCE;
    }
}

class Test{
    public static void main(String[] args) throws Exception{
        EnumSingleton instance = EnumSingleton.INSTANCE;
        System.out.println(instance);
        Constructor<EnumSingleton> declaredConstructor = EnumSingleton.class.getDeclaredConstructor(String.class,int.class);
        declaredConstructor.setAccessible(true);
        EnumSingleton enumSingleton = declaredConstructor.newInstance();
    }
}
