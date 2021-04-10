package com.basis.java.gof23.proxy.staticproxy;

public class Client {
    public static void main(String[] args) {
         AbstractSearcher searcher = new ProxySearcher();
        String zs = searcher.doSearch("zb");
        System.out.println(zs);
    }
}
