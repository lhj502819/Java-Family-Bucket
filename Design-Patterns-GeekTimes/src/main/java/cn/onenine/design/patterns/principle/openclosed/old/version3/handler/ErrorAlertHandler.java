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
public class ErrorAlertHandler extends AlertHandler{

    public ErrorAlertHandler(AlertRule alertRule, Notification notification) {
        super(alertRule, notification);
    }

    @Override
    public void check(ApiStatInfo apiStatInfo) {
        try {
            long errorCount = apiStatInfo.getErrorCount() / apiStatInfo.getDurationSeconds();
            if(errorCount > alertRule.getMatchedRule(apiStatInfo.getApi()).getMaxErrorCount()){
                notification.notify(NotificationEmergencyLevel.SERVER,"接口请求异常错误达到阈值");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
