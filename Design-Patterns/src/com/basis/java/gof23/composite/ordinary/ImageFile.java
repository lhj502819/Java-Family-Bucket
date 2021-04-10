package com.basis.java.gof23.composite.ordinary;

/**
 * 叶子节点  图片文件
 */
public class ImageFile extends AbstractFile {

    public ImageFile(String name) {
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
        System.out.println("这是图片文件："+super.getName());
    }
}
