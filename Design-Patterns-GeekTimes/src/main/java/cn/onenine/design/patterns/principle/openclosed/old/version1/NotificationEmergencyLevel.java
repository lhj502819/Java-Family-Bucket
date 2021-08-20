package cn.onenine.design.patterns.principle.openclosed.old.version1;

/**
 * Description：通知紧急级别
 *
 * @author li.hongjian
 * @email lhj502819@163.com
 * @since 2021/8/19
 */
public enum NotificationEmergencyLevel {
    URGENCY("紧急", 99),
    SERVER("服务器", 1);

    private String name;
    private Integer level;


    NotificationEmergencyLevel(String name, Integer level) {
        this.name = name;
        this.level = level;
    }
}
