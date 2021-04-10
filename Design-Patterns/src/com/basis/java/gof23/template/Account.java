package com.basis.java.gof23.template;

/**
 * 账户类   充当抽象类
 */
public abstract class Account {
    /**
     * 验证用户信息
     * @param account
     * @param psw
     * @return
     */
    public  boolean validate(String account,String psw){
        String format = String.format("账户登录验证,用户名：%s，密码%s", account, psw);
        System.out.println(format);
        if(account.equals("zs") && psw.equals("123456")){
            return true;
        }else {
            return false;
        }
    }

    public void display(){
        System.out.println("显示利息");
    }

    public void handler(String account,String psw){
        if(!validate(account,psw)){
            System.out.println("账户密码错误");
            return;
        }
        caculateInterest();
        display();
    }

    public abstract void caculateInterest();

}
