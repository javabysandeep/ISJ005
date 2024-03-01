package com.itshaala.springboot002;

import com.itshaala.springboot002.controller.StudentController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot002Application {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(SpringBoot002Application.class, args);
        StudentController studentController = context.getBean(StudentController.class);
        studentController.findAll().forEach(System.out::println);

        System.out.println("single record"+studentController.getById(101));
    }

}
