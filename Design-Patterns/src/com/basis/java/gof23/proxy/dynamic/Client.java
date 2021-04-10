package com.basis.java.gof23.proxy.dynamic;

import com.basis.java.gof23.proxy.dynamic.search.ISearcher;
import com.basis.java.gof23.proxy.dynamic.search.RealSearcher;
import com.basis.java.gof23.proxy.dynamic.update.IUpdate;
import com.basis.java.gof23.proxy.dynamic.update.RealUpdate;

/**
 * TODO
 *
 * @author lihongjian
 * @since 2020/4/27
 */
public class Client {
    public static void main(String[] args) {
        RealSearcher realSearcher = new RealSearcher();
        ProxyHandler proxyHandler = new ProxyHandler(realSearcher);
        ISearcher proxy1 = (ISearcher) proxyHandler.getProxy();
        System.out.println(proxy1.doSearch("zs"));;
        System.out.println(proxy1.doSearch("ls"));;

        //又需要对更新操作加日志
        //通过反射，在运行的时候才确定到代理的对象
        RealUpdate realUpdate = new RealUpdate();
        ProxyHandler proxyHandler1 = new ProxyHandler(realUpdate);
        IUpdate proxy = (IUpdate)proxyHandler1.getProxy();
        boolean zs = proxy.doUpdate("zs");
        System.out.println(zs);
    }
}
