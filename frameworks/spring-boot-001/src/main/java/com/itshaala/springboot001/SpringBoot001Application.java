package com.itshaala.springboot001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot001Application {

	public static void main(String[] args) {
		//1. gather all dependencies
		//2. generate the configurations
		//3. generate the in memory database
		//4. create the build
		//5. start the server
		//5. deploy the application
		SpringApplication.run(SpringBoot001Application.class, args);
	}

}
