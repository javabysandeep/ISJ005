package com.itshaala;

import com.itshaala.configuration.SpringBeanConfiguration;
import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringBeanConfiguration.class);
        CourseController courseController = applicationContext.getBean(CourseController.class);
        Course course = new Course(1,"Python","Core");
        courseController.addCourse(course);
    }
}
