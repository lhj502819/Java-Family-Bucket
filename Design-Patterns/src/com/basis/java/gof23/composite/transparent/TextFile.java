package com.basis.java.gof23.composite.transparent;

/**
 * 叶子节点  文本文件
 */
public class TextFile extends AbstractFile {

    public TextFile(String name) {
        super.setName(name);
    }

    @Override
    void display() {
        System.out.println("这是文本文件："+super.getName());
    }
}
