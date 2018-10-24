package com.xiepanpan.learn;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Date;

/**
 * describe:
 *
 * @author xiepanpan
 * @date 2018/10/24
 */
public class RAMJob implements Job {

    private static Logger logger = LoggerFactory.getLogger(RAMJob.class);

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        logger.info("say hello to quartz"+new Date());
    }
}
