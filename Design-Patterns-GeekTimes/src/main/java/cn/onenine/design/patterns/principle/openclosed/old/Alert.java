package cn.onenine.design.patterns.principle.openclosed.old;

/**
 * Description：接口监控告警相关
 *
 * @author li.hongjian
 * @email lhj502819@163.com
 * @since 2021/8/19
 */
public class Alert {

    private AlertRule rule;

    private Notification notification;

    public Alert(AlertRule rule, Notification notification) {
        this.rule = rule;
        this.notification = notification;
    }

    public void check(String api,long requestCount,long errorCount,long durationSeconds){

        long tps = requestCount / durationSeconds;

        if(tps > rule.getMatchedRule(api).getMaxTps()){
            notification.notify(NotificationEmergencyLevel.URGENCY,"接口请求频繁");
        }

        if(errorCount > rule.getMatchedRule(api).getMaxErrorCount()){
            notification.notify(NotificationEmergencyLevel.SERVER,"接口请求异常错误达到阈值");
        }

    }
}
