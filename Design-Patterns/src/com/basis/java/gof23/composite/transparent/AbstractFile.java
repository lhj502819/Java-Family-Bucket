package com.basis.java.gof23.composite.transparent;
/**
 * 这种为透明组合模式，有抽象构件对叶子节点不支持的方法提供默认实现，叶子节点不重写即可
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

    public void add(AbstractFile abstractFile){
        System.out.println("叶子节点不支持此方法");
    }

    public void remove(AbstractFile abstractFile){
        System.out.println("叶子节点不支持此方法");
    }

    public AbstractFile getChild(int i){
        throw new RuntimeException("叶子节点不支持此方法");
    }

    abstract void display();
}
