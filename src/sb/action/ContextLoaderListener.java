package sb.action;


import jodd.props.Props;
import util.CronScheduler;
import util.ParseUtil;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.IOException;

/**
 * Created by g8tuananh on 5/4/2015.
 */
public class ContextLoaderListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        try {
            Constant.P.load(ContextLoaderListener.class.getResourceAsStream("/config.properties"));
            MyLed.getInstance();
            new ParseUtil().updateAddress();
            new CronScheduler().updateIp();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        MyLed.getInstance().destroy();
    }
}
