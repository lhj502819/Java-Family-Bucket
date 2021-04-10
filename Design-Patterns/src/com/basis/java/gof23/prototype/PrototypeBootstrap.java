package com.basis.java.gof23.prototype;

import java.util.Date;

/**
 * MyResume clone {@link MyResume}
 *
 * @author lihongjian
 * @since 2020/4/25
 */
public class PrototypeBootstrap {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date date = new Date();
        MyResume myResume = new MyResume("李宏健", date);

        MyResume clone = myResume.clone();

        System.out.println(myResume);
        System.out.println(clone);
        System.out.println("===========");
        System.out.println(myResume.hashCode());
        System.out.println(clone.hashCode());
        System.out.println("===========");
        date.setTime(13213123);//浅拷贝
        System.out.println("prototype.birthday："+myResume.getBirthday());
        System.out.println("clone.birthday："+clone.getBirthday());
        System.out.println("===========");


        //*******************************************************************//
        Date date1 = new Date();
        MyResumeDeep myResumeDeep = new MyResumeDeep("李宏健",date1 );

        MyResumeDeep myResumeDeepClone = myResumeDeep.clone();
        date1.setTime(34134131);
        System.out.println(myResumeDeep.getBirthday());
        System.out.println(myResumeDeepClone.getBirthday());

    }
}
