package com.basis.java.gof23.proxy.dynamic.util;

/**
 * 权限验证
 */
public class AccessValidator {

    public boolean validator(String userId){
        if(userId.equals("zs")){
            System.out.println("权限校验"+userId);
            System.out.println("检验通过");
            return true;
        }else {
            System.out.println("权限校验"+userId);
            System.out.println("检验不通过");
            return false;
        }
    }

}
