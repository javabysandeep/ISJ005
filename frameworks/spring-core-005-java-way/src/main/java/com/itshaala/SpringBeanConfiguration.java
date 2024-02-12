package com.itshaala;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SpringBeanConfiguration {
    @Bean(name = "course")
    @Scope(scopeName = "prototype")
    public Course getCourse() {
        Course course = new Course(1, "Python", "Core, Adv");
        return course;
    }
}
