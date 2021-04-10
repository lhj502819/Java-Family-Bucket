package com.basis.java.gof23.prototype;

import java.util.Date;

/**
 * 深拷贝
 *
 * @author lihongjian
 * @since 2020/4/25
 */
public class MyResumeDeep implements Cloneable{
    private String name;
    private Date birthday;

    public MyResumeDeep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    protected MyResumeDeep clone() throws CloneNotSupportedException {
        //深拷贝--》通过重新创建一个Date对象并赋给clone出来的对象
        MyResumeDeep clone = (MyResumeDeep) super.clone();
        Date birthday = clone.getBirthday();
        Date clone1 = (Date) birthday.clone();
        clone.setBirthday(clone1);
        return clone;
    }

    @Override
    public String toString() {
        return "MyResume{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}';
    }
}
