package com.basis.java.gof23.composite.transparent;

/**
 * 叶子节点  图片文件
 */
public class ImageFile extends AbstractFile {

    public ImageFile(String name) {
        super.setName(name);
    }

    @Override
    void display() {
        System.out.println("这是图片文件："+super.getName());
    }
}
