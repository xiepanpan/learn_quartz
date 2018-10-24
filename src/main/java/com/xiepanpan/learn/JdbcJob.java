package com.xiepanpan.learn;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;


public class JdbcJob implements Job{

    private static Logger logger = LoggerFactory.getLogger(JdbcJob.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
            logger.info("JdbcJob start.. ");
            logger.info("hello quartz .."+new SimpleDateFormat("yyy-MM-dd HH:mm:ss")
                    .format(new Date()));
            logger.info("JdbcJob end.. ");
    }
}
