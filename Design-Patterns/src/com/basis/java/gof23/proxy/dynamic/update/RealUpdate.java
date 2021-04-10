package com.basis.java.gof23.proxy.dynamic.update;

/**
 * 真实对象
 *
 * @author lihongjian
 * @since 2020/4/27
 */
public class RealUpdate implements IUpdate {
    @Override
    public boolean doUpdate(String userId) {
        System.out.println("更新成功");
        return true;
    }
}
