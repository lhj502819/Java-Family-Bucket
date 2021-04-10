package com.basis.java.gof23.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

/**
 * 懒汉式单例模式
 *
 * @author lihongjian
 * @since 2020/4/24
 */
public class LazySingleton {

    private static Boolean flag = false;

    private LazySingleton(){
        synchronized (LazySingleton.class){
            if(flag){
                throw new RuntimeException("请勿通过反射破坏单例");
            }else {
                flag = true;
            }
//            if(instance!=null){
//            }
        }
        System.out.println(Thread.currentThread().getName());
    }

    //初始化类之后不立刻创建对象
    private volatile static LazySingleton instance;

//    /**
//     * 线程不安全的
//     * @return
//     */
//    public static LazySingleton getInstance(){
//        //防止重复创建，判断引用是否为空
//        //单线程下没有问题，多线程下会有问题
//        if(instance == null){
//            instance = new LazySingleton();
//        }
//        return instance;
//    }

    /**
     * 线程安全的
     * @return
     */
    public static LazySingleton getInstance(){
//        防止重复创建，判断引用是否为空
//        单线程下没有问题，多线程下会有问题
        if(instance == null){
            //DCL单例模式 双重检测锁
            if(instance == null){//第一次检测
                //多线程下使用synchronized加锁防止多次创建对象
                synchronized (LazySingleton.class){
                    if(instance == null){//再次检测是否为null
                        instance = new LazySingleton();//非原子操作
                        /**
                         * new LazySingleton()底层发生的操作
                         * 1、分配内存空间
                         * 2、执行构造方法，初始化对象
                         * 3、把对象指向分配的内存空间
                         * 可能会出现指令重排的现选
                         *
                         * 期望执行1、2、3
                         * 可能会执行成 1、3、2
                         *
                         * thread A 执行 1、3
                         * thread B 执行 判断singleton不为空，但是还没有执行2，就会有问题
                         *
                         * 因此需要加volatile防止指令重排
                         */
                    }
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) throws Exception{
//        for (int i = 0 ; i < 100 ; i++){
//            new Thread(()->{
//                LazySingleton.getInstance();
//            }).start();
//        }
        //通过反射可以破坏单例
//        LazySingleton instance = LazySingleton.getInstance();
        Constructor<LazySingleton> declaredConstructor = LazySingleton.class.getDeclaredConstructor(null);
        //
        declaredConstructor.setAccessible(true);
        LazySingleton lazySingleton = declaredConstructor.newInstance();
        Field flag = LazySingleton.class.getDeclaredField("flag");
        flag.setAccessible(true);
        flag.set(lazySingleton,false);
        LazySingleton instance2 = declaredConstructor.newInstance();
        System.out.println(instance2);
        System.out.println(lazySingleton);
    }


}
