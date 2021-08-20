package cn.onenine.design.patterns.principle.openclosed.old.version3;

/**
 * Description：告警规则
 *
 * @author li.hongjian
 * @email lhj502819@163.com
 * @since 2021/8/19
 */
public class Rule {
    private long maxTimeoutTps;

    public long getMaxTps() {
        return 0;
    }

    public long getMaxErrorCount() {
        return 0;
    }

    public long getMaxTimeoutTps() {
        return maxTimeoutTps;
    }

    public void setMaxTimeoutTps(long maxTimeoutTps) {
        this.maxTimeoutTps = maxTimeoutTps;
    }
}
