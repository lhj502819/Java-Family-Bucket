package com.basis.java.gof23.composite.ordinary;
/**
 * 叶子节点  文本文件
 */
public class TextFile extends AbstractFile {

    public TextFile(String name) {
        super.setName(name);
    }

    @Override
    void add(AbstractFile abstractFile) {
        System.out.println("不支持此方法");
    }

    @Override
    void remove(AbstractFile abstractFile) {
        System.out.println("不支持此方法");
    }

    @Override
    AbstractFile getChild(int i) {
        throw new RuntimeException("不支持此方法");
    }

    @Override
    void display() {
        System.out.println("这是文本文件："+super.getName());
    }
}
