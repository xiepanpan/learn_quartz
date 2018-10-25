package com.xiepanpan.spring;

import org.quartz.Scheduler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * describe:
 *
 * @author xiepanpan
 * @date 2018/10/25
 */
public class SpringQuartzTest {

    private static Scheduler scheduler;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_quartz.xml");
//        applicationContext.getBean("schedulerFactoryBean");
    }
}
