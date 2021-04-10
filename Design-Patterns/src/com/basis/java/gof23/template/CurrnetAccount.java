package com.basis.java.gof23.template;

/**
 * 活期账户
 */
public class CurrnetAccount extends Account{
    @Override
    public void caculateInterest() {
        System.out.println("按照活期利率计算利息！");
    }
}
