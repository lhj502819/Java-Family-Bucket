package com.basis.java.gof23.proxy.dynamic.search;

/**
 * 真实对象
 *
 * @author lihongjian
 * @since 2020/4/27
 */
public class RealSearcher implements ISearcher {
    @Override
    public String doSearch(String userId) {
        return "查询到了结果";
    }
}
