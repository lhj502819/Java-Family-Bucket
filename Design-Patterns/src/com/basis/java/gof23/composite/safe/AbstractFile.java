package com.basis.java.gof23.composite.safe;
/**
 * 这种为安全组合模式，抽象构件不提供行为方法，有子类自行去规定自己的行为
 * 这种模式中客户不存在客户调用构件不能执行的行为方法的情况，为安全的组合模式
 */
public abstract class AbstractFile {
    //组件名称
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    abstract void display();
}
