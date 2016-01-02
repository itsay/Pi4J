package util;

import jodd.datetime.JDateTime;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;
import sb.action.ArduinoController;
import sb.action.Constant;

/**
 * Created with IntelliJ IDEA.
 * User: tuananh
 * Date: 9/24/13
 * Time: 1:46 PM
 */
public class CronScheduler implements Job {
    public void updateIp(){
        try {
            SchedulerFactory sf = new StdSchedulerFactory();
            Scheduler scheduler = sf.getScheduler();
            scheduler.deleteJob(JobKey.jobKey("UpdateIP", "UpdateIP"));
            scheduler.start();
            JobDetail job = JobBuilder.newJob(CronScheduler.class).withIdentity("UpdateIP", "UpdateIP").build();
            //"0 1 00 * * ?" Fire at 00h01 am every day
            //second minutes hour day month year
            //more information: http://quartz-scheduler.org/api/2.0.0/org/quartz/CronExpression.html
            //and http://quartz-scheduler.org/api/2.0.0/org/quartz/CronTrigger.html
            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("UpdateIP", "UpdateIP")
                    .withSchedule(CronScheduleBuilder.cronSchedule("0 0/5 * 1/1 * ? *")).build();
            scheduler.scheduleJob(job, trigger);
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    public void switchoffFan(int minutes){
        try {
            JDateTime dateTime = new JDateTime();
            dateTime.addMinute(minutes);
            SchedulerFactory sf = new StdSchedulerFactory();
            Scheduler scheduler = sf.getScheduler();
            scheduler.deleteJob(JobKey.jobKey("switchoffFan", "switchoffFan"));
            scheduler.start();
            JobDetail job = JobBuilder.newJob(CronScheduler.class).withIdentity("switchoffFan", "switchoffFan").build();
            Trigger trigger = TriggerBuilder.newTrigger().withIdentity("switchoffFan", "switchoffFan")
                    .startAt(dateTime.convertToDate()).build();
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
        if (jobExecutionContext.getTrigger().getJobKey().getName().equals("switchoffFan")) {
            new ArduinoController().turnOffFan();
        }else if (jobExecutionContext.getTrigger().getJobKey().getName().equals("UpdateIP")) {
            new ParseUtil().updateAddress();
        }
    }

}
