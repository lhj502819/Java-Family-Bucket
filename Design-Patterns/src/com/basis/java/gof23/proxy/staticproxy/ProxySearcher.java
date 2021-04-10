package com.basis.java.gof23.proxy.staticproxy;

import com.basis.java.gof23.proxy.dynamic.util.AccessValidator;
import com.basis.java.gof23.proxy.dynamic.util.Logger;

public class ProxySearcher extends AbstractSearcher {
    private RealSearcher realSearcher = new RealSearcher();

    private Logger logger ;

    private AccessValidator accessValidator;


    @Override
    public String doSearch(String userId) {
        if(!accessValidator(userId))
            return "无权限";
        String info = realSearcher.doSearch(userId);
        log(userId);
        return info;
    }
    public boolean accessValidator(String userId){
        if(accessValidator==null){
            accessValidator = new AccessValidator();
        }
        return accessValidator.validator(userId);
    }

    public void log(String userId){
        if(logger==null){
            logger = new Logger();
        }
        logger.recordLogger(userId);
    }


}
