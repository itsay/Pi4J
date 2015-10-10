package util;

import jodd.datetime.JDateTime;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import sb.action.Constant;

/**
 * Created with IntelliJ IDEA.
 * User: tuananh
 * Date: 9/24/13
 * Time: 1:46 PM
 */
public class CronScheduler implements Job {
    public CronScheduler() {
        try {
            SchedulerFactory sf = new StdSchedulerFactory();
            Scheduler scheduler = sf.getScheduler();
            scheduler.start();
            JobDetail job = JobBuilder.newJob(CronScheduler.class).withIdentity("UpdateIP", "UpdateIP").build();
            //"0 1 00 * * ?" Fire at 00h01 am every day
            //second minutes hour day month year
            //more information: http://quartz-scheduler.org/api/2.0.0/org/quartz/CronExpression.html
            //and http://quartz-scheduler.org/api/2.0.0/org/quartz/CronTrigger.html
            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("UpdateIP", "UpdateIP")
                    .withSchedule(CronScheduleBuilder.cronSchedule("0 1 00 * * ?")).build();
            scheduler.scheduleJob(job, trigger);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    public static void stop(){
        SchedulerFactory sf = new StdSchedulerFactory();
        try {
            sf.getScheduler().shutdown(true);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

    }

}
