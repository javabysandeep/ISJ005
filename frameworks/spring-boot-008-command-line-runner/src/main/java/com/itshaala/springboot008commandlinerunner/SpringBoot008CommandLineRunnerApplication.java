package com.itshaala.springboot008commandlinerunner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringBoot008CommandLineRunnerApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext =
                SpringApplication.run(SpringBoot008CommandLineRunnerApplication.class, args);
        Person person = applicationContext.getBean(Person.class);
        System.out.println(person);

    }
}
