package com.xiepanpan.learn;

import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.SimpleTrigger;

public class JdbcQuartzTest {

    public static void main(String[] args) {
        startSchedule();
    }

    private static void startSchedule() {
        //创建jobDetail实例
        JobDetail jobDetail = JobBuilder.newJob(JdbcJob.class)
                .withIdentity("", "")
                .build();
        //创建触发器
//        Sim
    }
}
