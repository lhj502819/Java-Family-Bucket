package com.basis.java.gof23.proxy.dynamic.util;

public class Logger {
    public void recordLogger(String userId){
        String format = String.format("logger ------->>>>>>>用户%s查询商务信息数据", userId);
        System.out.println(format);
    }
}
