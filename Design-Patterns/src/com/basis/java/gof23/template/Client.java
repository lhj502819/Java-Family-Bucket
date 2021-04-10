package com.basis.java.gof23.template;

public class Client {
    public static void main(String[] args) {
        Account account = new SavingAccount();
        account = new CurrnetAccount();
        account.handler("zs","123456");
    }
}
