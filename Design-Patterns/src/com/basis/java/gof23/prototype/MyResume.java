package com.basis.java.gof23.prototype;

import java.util.Date;

/**
 * TODO
 *
 * @author lihongjian
 * @since 2020/4/25
 */
public class MyResume implements Cloneable{
    private String name;
    private Date birthday;

    public MyResume(String name, Date birthday) {
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
    protected MyResume clone() throws CloneNotSupportedException {
        //浅拷贝--》Object#clone为浅拷贝
        MyResume clone = (MyResume) super.clone();
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
