package com.basis.java.gof23.template;

/**
 * 定期账户
 */
public class SavingAccount extends Account{
    @Override
    public void caculateInterest() {
        System.out.println("按照定期利率计算利息");
    }
}
