package com.basis.java.gof23.proxy.dynamic;

import com.basis.java.gof23.proxy.dynamic.util.AccessValidator;
import com.basis.java.gof23.proxy.dynamic.util.Logger;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * TODO
 *
 * @author lihongjian
 * @since 2020/4/27
 */
public class ProxyHandler implements InvocationHandler {

    private Object target;

    private AccessValidator accessValidator;

    private Logger logger;

    public void log(String userId) {
        if (logger == null) {
            logger = new Logger();
        }
        logger.recordLogger(userId);
    }

    public boolean accessValidator(String userId) {
        if (accessValidator == null) {
            accessValidator = new AccessValidator();
        }
        return accessValidator.validator(userId);
    }

    public ProxyHandler(Object searcher) {
        this.target = searcher;
    }

    public Object getProxy() {
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String userId = (String) args[0];
        if (!accessValidator(userId))
            return "无权限";
        Object result = method.invoke(target, args);
        log(userId);
        return result;
    }
}
