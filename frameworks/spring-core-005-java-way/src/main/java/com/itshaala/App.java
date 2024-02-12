package com.itshaala;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);
        Course course1 = applicationContext.getBean(Course.class);
        Course course2 = applicationContext.getBean(Course.class);
        System.out.println(course1.hashCode());
        System.out.println(course2.hashCode());
    }
}
