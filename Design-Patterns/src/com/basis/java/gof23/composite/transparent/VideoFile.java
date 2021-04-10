package com.basis.java.gof23.composite.transparent;

/**
 * 叶子节点  音频文件
 */
public class VideoFile extends AbstractFile {
    public VideoFile(String name) {
        super.setName(name);
    }

    @Override
    void display() {
        System.out.println("这是音频文件："+super.getName());
    }
}
