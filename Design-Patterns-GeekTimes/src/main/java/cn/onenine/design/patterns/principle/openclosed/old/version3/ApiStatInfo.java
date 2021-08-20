package cn.onenine.design.patterns.principle.openclosed.old.version3;

/**
 * Description：接口信息类
 *
 * @author li.hongjian
 * @email lhj502819@163.com
 * @since 2021/8/20
 */
public class ApiStatInfo {

    private String api;
    private long requestCount;
    private long errorCount;
    private long durationSeconds;
    private long timeoutCount;

    public String getApi() {
        return api;
    }

    public void setApi(String api) {
        this.api = api;
    }

    public long getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(long requestCount) {
        this.requestCount = requestCount;
    }

    public long getErrorCount() {
        return errorCount;
    }

    public void setErrorCount(long errorCount) {
        this.errorCount = errorCount;
    }

    public long getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(long durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public long getTimeoutCount() {
        return timeoutCount;
    }

    public void setTimeoutCount(long timeoutCount) {
        this.timeoutCount = timeoutCount;
    }
}
