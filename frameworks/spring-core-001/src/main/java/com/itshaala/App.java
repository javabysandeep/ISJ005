package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.cfg.xml");
        //Course course = new Course(1, "Java", 11);
        Course course = applicationContext.getBean("courseReference", Course.class);
        System.out.println(course);
    }
}
