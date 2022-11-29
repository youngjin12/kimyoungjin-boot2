package com.herokuapp.kimyoungjinboot2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class KimyoungjinBoot2Application {

	public static void main(String[] args) {
		SpringApplication.run(KimyoungjinBoot2Application.class, args);
	}

}
