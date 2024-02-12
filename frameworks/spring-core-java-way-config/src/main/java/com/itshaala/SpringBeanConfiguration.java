package com.itshaala;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.itshaala")
public class SpringBeanConfiguration {

   /* @Bean(name = "courseReference")
    public Course getCourse() {
        Course course = new Course(1, "Java", 99, "Core advance");
        return course;
    }*/
}
