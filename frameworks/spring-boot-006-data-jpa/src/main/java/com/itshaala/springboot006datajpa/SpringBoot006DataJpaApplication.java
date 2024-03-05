package com.itshaala.springboot006datajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot006DataJpaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBoot006DataJpaApplication.class, args);
        CourseRepository courseRepository = context.getBean(CourseRepository.class);
        courseRepository.findAll().forEach(System.out::println);
    }

}
