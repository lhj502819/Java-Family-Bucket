package cn.onenine.design.patterns.principle.openclosed.old.version3.handler;

import cn.onenine.design.patterns.principle.openclosed.old.version3.AlertRule;
import cn.onenine.design.patterns.principle.openclosed.old.version3.ApiStatInfo;
import cn.onenine.design.patterns.principle.openclosed.old.version3.Notification;

/**
 * Description：告警Handler
 *
 * @author li.hongjian
 * @email lhj502819@163.com
 * @since 2021/8/20
 */
public abstract class AlertHandler {

    protected AlertRule alertRule;

    protected Notification notification;

    public AlertHandler(AlertRule alertRule, Notification notification) {
        this.alertRule = alertRule;
        this.notification = notification;
    }

    public abstract void check(ApiStatInfo apiStatInfo);
}
