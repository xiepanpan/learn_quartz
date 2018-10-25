//package com.xiepanpan.job;
//
//import org.quartz.*;
//import org.quartz.impl.StdSchedulerFactory;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import java.util.Date;
//
///**
// * describe:
// *
// * @author xiepanpan
// * @date 2018/10/25
// */
//public class RAMQuartzTest {
//
//    private static Logger logger = LoggerFactory.getLogger(RAMQuartzTest.class);
//
//    public static void main(String[] args) throws SchedulerException {
//        //1.创建Scheduler的工厂
//        SchedulerFactory schedulerFactory = new StdSchedulerFactory();
//
//        Scheduler scheduler = schedulerFactory.getScheduler();
//
//        JobDetail jobDetail = JobBuilder.newJob(HelloWorldJob.class)
//                .withDescription("this is ram job")
//                .withIdentity("ramJob", "ramGroup")
//                .build();
//
//        //任务开始运行时间  当前时间3秒后执行
//        long time = System.currentTimeMillis() + 3 * 1000L;
//
//        Date startTime = new Date(time);
//
//        Trigger trigger = TriggerBuilder.newTrigger()
//                .withDescription("")
//                .withIdentity("ramTrigger", "ramTriggerGroup")
//                .startAt(startTime)
////                .withSchedule(SimpleScheduleBuilder.simpleSchedule()
////                        .withIntervalInSeconds(3).withRepeatCount(5))//设定每3秒执行一次 执行5次
//                .startAt(startTime)
//                .withSchedule(CronScheduleBuilder.cronSchedule("0/2 * * * * ?"))//每两秒执行一次
//                .build();
//
//        //注册任务和定时器
//        scheduler.scheduleJob(jobDetail,trigger);
//
//        //启动调度时间
//        scheduler.start();
//        logger.info("启动时间："+new Date());
//    }
//}