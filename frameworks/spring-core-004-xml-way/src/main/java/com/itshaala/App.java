package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("spring.config.xml");
        Course course1 = applicationContext.getBean(Course.class);
        Course course2 = applicationContext.getBean(Course.class);
        System.out.println(course1.hashCode());
        System.out.println(course2.hashCode());
    }
}
