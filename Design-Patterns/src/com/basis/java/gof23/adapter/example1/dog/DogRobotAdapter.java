package com.basis.java.gof23.adapter.example1.dog;

import com.basis.java.gof23.adapter.example1.Robot;

/**
 * 适配器
 *
 * @author lihongjian
 * @since 2020/4/25
 */
public class DogRobotAdapter implements Robot {
    Dog dog ;//维持一个对适配者对象的引用

    public DogRobotAdapter(Dog dog) {
        this.dog = dog;//为要适配的对象赋值
    }

    @Override
    public void cry() {
        dog.wangwang();
    }

    @Override
    public void run() {
        dog.run();
    }
}
