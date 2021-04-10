package com.basis.java.gof23.proxy.staticproxy;

public class RealSearcher extends AbstractSearcher {
    @Override
    public String doSearch(String userId) {
        System.out.println("商务信息查询....");
        return "查询结构：xxxxxx";
    }
}
