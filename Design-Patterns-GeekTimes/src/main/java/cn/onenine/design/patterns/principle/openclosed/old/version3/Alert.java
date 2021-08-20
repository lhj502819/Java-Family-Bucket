package cn.onenine.design.patterns.principle.openclosed.old.version3;

import cn.onenine.design.patterns.principle.openclosed.old.version3.handler.AlertHandler;

import java.util.ArrayList;
import java.util.List;

/**
 * Description：接口监控告警相关，2.0版本需要增加接口超时处理逻辑
 *  使用如下改动方式破坏了对修改关闭的原则，修改了原有的方法，非常不友好，因此引入第三个版本
 *  1、将check()分发的多个入参封装成ApiStatInfo类
 *  2、引入handler的概念，将if判断逻辑分散在各个handler中
 *      当需要增加接口超时告警时，只需要在ApiStatInfo增加timeoutCount，增加 TimeoutAlertHandler
 *
 * @author li.hongjian
 * @email lhj502819@163.com
 * @since 2021/8/19
 * @version 3.0
 */
public class Alert {

   private  List<AlertHandler> handlers = new ArrayList<>();

   public void addHandler(AlertHandler alertHandler){
       handlers.add(alertHandler);
   }

    public Alert() {
    }

    //改动1，添加参数 timeoutCount
    public void check(ApiStatInfo apiStatInfo){
        for (AlertHandler handler : handlers) {
            handler.check(apiStatInfo);
        }
    }
}
