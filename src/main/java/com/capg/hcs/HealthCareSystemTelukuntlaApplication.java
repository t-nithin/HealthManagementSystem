package com.capg.hcs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.capg.hcs.dao") 
public class HealthCareSystemTelukuntlaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HealthCareSystemTelukuntlaApplication.class, args);
	}

}
