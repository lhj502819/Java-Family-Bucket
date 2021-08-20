package cn.onenine.design.patterns.principle.openclosed.old.version3.handler;

import cn.onenine.design.patterns.principle.openclosed.old.version1.NotificationEmergencyLevel;
import cn.onenine.design.patterns.principle.openclosed.old.version3.AlertRule;
import cn.onenine.design.patterns.principle.openclosed.old.version3.ApiStatInfo;
import cn.onenine.design.patterns.principle.openclosed.old.version3.Notification;

/**
 * Description：接口超时告警通知handler
 *
 * @author li.hongjian
 * @email lhj502819@163.com
 * @since 2021/8/20
 */
public class TimeoutAlertHandler extends AlertHandler{

    public TimeoutAlertHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        try {
            long timeoutTps = apiStatInfo.getTimeoutCount() / apiStatInfo.getDurationSeconds();
            if(timeoutTps > alertRule.getMatchedRule(apiStatInfo.getApi()).getMaxTimeoutTps()){
                notification.notify(NotificationEmergencyLevel.URGENCY,"接口超时次数达到阈值");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
