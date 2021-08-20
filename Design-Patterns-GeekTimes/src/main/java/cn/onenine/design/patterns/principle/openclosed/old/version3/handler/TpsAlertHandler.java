package cn.onenine.design.patterns.principle.openclosed.old.version3.handler;

import cn.onenine.design.patterns.principle.openclosed.old.version1.NotificationEmergencyLevel;
import cn.onenine.design.patterns.principle.openclosed.old.version3.AlertRule;
import cn.onenine.design.patterns.principle.openclosed.old.version3.ApiStatInfo;
import cn.onenine.design.patterns.principle.openclosed.old.version3.Notification;

/**
 * Description：Tps告警通知handler
 *
 * @author li.hongjian
 * @email lhj502819@163.com
 * @since 2021/8/20
 */
public class TpsAlertHandler extends AlertHandler{

    public TpsAlertHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        try {
            long tps = apiStatInfo.getRequestCount() / apiStatInfo.getDurationSeconds();
            if(tps > alertRule.getMatchedRule(apiStatInfo.getApi()).getMaxTps()){
                notification.notify(NotificationEmergencyLevel.URGENCY,"接口请求频繁");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
