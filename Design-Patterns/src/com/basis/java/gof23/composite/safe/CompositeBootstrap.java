package com.basis.java.gof23.composite.safe;

public class CompositeBootstrap {
    public static void main(String[] args) {
        Folder file = new Folder("D:/");
        Folder file2 = new Folder("学习文件");
        Folder file3 = new Folder("设计模式");
        ImageFile imageFile = new ImageFile("UML图文件");
        TextFile textFile = new TextFile("观察者模式文本文件");
        file2.add(file3);
        file.add(file2);
        file3.add(imageFile);
        file2.add(textFile);

        file.display();

    }
}
