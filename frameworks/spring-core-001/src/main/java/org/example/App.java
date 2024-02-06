package org.example;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) throws Throwable {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-bean-config.xml");
        CourseService courseServiceRef = (CourseService) applicationContext.getBean("courseServiceRef");
        courseServiceRef.addCourse();
    }
}
