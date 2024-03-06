package com.itshaala.springboot008commandlinerunner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class EmailSender implements CommandLineRunner {
    public EmailSender() {
        System.out.println("Email Sender bean created");
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Email has been sent");
        for (String str : args) {
            System.out.println(str);
        }
    }
}
