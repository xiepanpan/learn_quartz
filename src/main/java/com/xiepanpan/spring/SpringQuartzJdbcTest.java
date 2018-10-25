package com.xiepanpan.spring;

import org.quartz.Scheduler;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * describe: Jdbc存储方式的Job
 *
 * @author xiepanpan
 * @date 2018/10/25
 */
public class SpringQuartzJdbcTest {

    private static Scheduler scheduler;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring_quartz_jdbc.xml");
//        applicationContext.getBean("schedulerFactoryBean");
    }
}
