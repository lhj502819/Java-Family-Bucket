package com.basis.java.gof23.composite.transparent;

public class CompositeBootstrap {
    public static void main(String[] args) {
        AbstractFile file = new Folder("D:/");
        AbstractFile file2 = new Folder("学习文件");
        AbstractFile file3 = new Folder("设计模式");
        AbstractFile imageFile = new ImageFile("UML图文件");
        AbstractFile textFile = new TextFile("观察者模式文本文件");
        textFile.add(imageFile);
        file2.add(file3);
        file.add(file2);
        file3.add(imageFile);
        file2.add(textFile);

        file.display();

    }
}
