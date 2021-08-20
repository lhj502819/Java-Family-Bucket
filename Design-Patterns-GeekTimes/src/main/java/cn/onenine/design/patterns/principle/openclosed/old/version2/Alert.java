package cn.onenine.design.patterns.principle.openclosed.old.version2;

import cn.onenine.design.patterns.principle.openclosed.old.version1.AlertRule;
import cn.onenine.design.patterns.principle.openclosed.old.version1.NotificationEmergencyLevel;

/**
 * Description：接口监控告警相关，2.0版本需要增加接口超时处理逻辑
 *  使用如下改动方式破坏了对修改关闭的原则，修改了原有的方法，非常不友好，因此引入第三个版本
 *  1、将check()分发的多个入参封装成ApiStatInfo类
 *  2、引入handler的概念，将if判断逻辑分散在各个handler中
 *
 * @author li.hongjian
 * @email lhj502819@163.com
 * @since 2021/8/19
 * @version 2.0
 */
public class Alert {

    private AlertRule rule;

    private Notification notification;

    public Alert(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    //改动1，添加参数 timeoutCount
    public void check(String api,long requestCount,long errorCount,long durationSeconds, long timeoutCount){

        long tps = requestCount / durationSeconds;

        if(tps > rule.getMatchedRule(api).getMaxTps()){
            notification.notify(NotificationEmergencyLevel.URGENCY,"接口请求频繁");
        }

        if(errorCount > rule.getMatchedRule(api).getMaxErrorCount()){
            notification.notify(NotificationEmergencyLevel.SERVER,"接口请求异常错误达到阈值");
        }

        //改动2，添加接口超时处理逻辑
        long timeoutTps = timeoutCount / durationSeconds;
        if(timeoutTps >rule.getMatchedRule(api).getMaxTimeoutTps()){
            notification.notify(NotificationEmergencyLevel.URGENCY,"接口请求超时达到阈值");
        }


    }
}
