package com.cybage.studentdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.CrossOrigin;

@SpringBootApplication(scanBasePackages="com.cybage")
@EnableJpaRepositories(basePackages = "com.cybage.repository")
@EntityScan(basePackages = "com.cybage.model")
public class StudentdemoApplication {

	public static void main(String[] args) {
		// Do nothing because of X and Y.
		SpringApplication.run(StudentdemoApplication.class, args);
	}

}
