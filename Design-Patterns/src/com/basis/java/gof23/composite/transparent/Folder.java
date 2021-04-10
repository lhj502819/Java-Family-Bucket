package com.basis.java.gof23.composite.transparent;

import java.util.ArrayList;
import java.util.List;

/**
 * 容器对象  文件夹
 */
public class Folder extends AbstractFile {

    private List<AbstractFile> files;

    public Folder(String name) {
        super.name = name;
        if(files==null){//双重检测锁，防止并发下线程不安全
            synchronized (Folder.class){
                //懒加载
                if(files==null){
                    this.files = new ArrayList<>();
                }
            }
        }
    }

    @Override
   public void add(AbstractFile abstractFile) {
        files.add(abstractFile);
    }

    @Override
    public void remove(AbstractFile abstractFile) {
        files.remove(abstractFile);
    }

    @Override
    public AbstractFile getChild(int i) {
        return files.get(i);
    }

    @Override
    void display() {
        for (AbstractFile file : files) {
            file.display();
        }
    }
}
