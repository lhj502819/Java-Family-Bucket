package com.basis.java.gof23.composite.ordinary;
/**
 * 叶子节点  音频文件
 */
public class VideoFile extends AbstractFile {
    public VideoFile(String name) {
        super.setName(name);
    }

    @Override
    void add(AbstractFile abstractFile) {

    }

    @Override
    void remove(AbstractFile abstractFile) {

    }

    @Override
    AbstractFile getChild(int i) {
        throw new RuntimeException("不支持此方法");
    }

    @Override
    void display() {
        System.out.println("这是音频文件："+super.getName());
    }
}
