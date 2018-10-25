//package com.xiepanpan.job;
//
//import org.quartz.*;
//import org.quartz.impl.StdSchedulerFactory;
//
//public class JdbcQuartzTest {
//
//    public static void main(String[] args) throws SchedulerException {
//        startSchedule();
//    }
//
//    private static void startSchedule() throws SchedulerException {
//        //1.创建jobDetail实例
//        JobDetail jobDetail = JobBuilder.newJob(HelloWorldJob.class)
//                .withIdentity("jdbcJob", "jGroup")
//                .build();
//        //2.创建触发器
//        SimpleScheduleBuilder scheduleBuilder = SimpleScheduleBuilder.repeatSecondlyForTotalCount(5);
//        Trigger trigger = TriggerBuilder.newTrigger()
//                .withIdentity("jdbc_trigger", "triggerGroup")
//                .startNow()
//                .withSchedule(scheduleBuilder).build();
//        //3.创建调度器
//        Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();
//        scheduler.start();
//        //注册任务和触发器
//        scheduler.scheduleJob(jobDetail,trigger);
//        try {
//            Thread.sleep(60000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//        scheduler.shutdown();
//
//    }
//}
