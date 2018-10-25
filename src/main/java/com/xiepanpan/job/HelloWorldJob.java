package com.xiepanpan.job;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * describe:
 *
 * @author xiepanpan
 * @date 2018/10/25
 */
public class HelloWorldJob implements Job {

    private static Logger logger = LoggerFactory.getLogger(HelloWorldJob.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("Job start.. ");
        logger.info("hello quartz .."+new SimpleDateFormat("yyy-MM-dd HH:mm:ss")
                .format(new Date()));
        logger.info("Job end.. ");
    }
}