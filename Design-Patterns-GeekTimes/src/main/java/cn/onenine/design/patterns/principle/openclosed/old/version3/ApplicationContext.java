package cn.onenine.design.patterns.principle.openclosed.old.version3;

import cn.onenine.design.patterns.principle.openclosed.old.version3.handler.ErrorAlertHandler;
import cn.onenine.design.patterns.principle.openclosed.old.version3.handler.TimeoutAlertHandler;
import cn.onenine.design.patterns.principle.openclosed.old.version3.handler.TpsAlertHandler;

/**
 * Description：具体使用
 *
 * @author li.hongjian
 * @email lhj502819@163.com
 * @since 2021/8/20
 */
public class ApplicationContext {

    private AlertRule alertRule;
    private Notification notification;

    private Alert alert;

    public void initializeBeans() {
        alertRule = new AlertRule();
        notification = new Notification();
        alert = new Alert();
        alert.addHandler(new ErrorAlertHandler(alertRule, notification));
        alert.addHandler(new TpsAlertHandler(alertRule, notification));
        alert.addHandler(new TimeoutAlertHandler(alertRule, notification));
    }

    public Alert getAlert(){
        return alert;
    }

    private static final ApplicationContext INSTANCE = new ApplicationContext();

    private ApplicationContext(){
        initializeBeans();
    }

    public static ApplicationContext getInstance(){
        return INSTANCE;
    }
}

class Demo{
    public static void main(String[] args) {
        ApiStatInfo apiStatInfo = new ApiStatInfo();
        apiStatInfo.setApi("/test");
        apiStatInfo.setDurationSeconds(100000);
        apiStatInfo.setRequestCount(1000);
        apiStatInfo.setErrorCount(2000);
        apiStatInfo.setTimeoutCount(1000);
        ApplicationContext.getInstance().getAlert().check(apiStatInfo);
    }
}
