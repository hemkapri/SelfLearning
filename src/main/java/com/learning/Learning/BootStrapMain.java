package com.learning.Learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.learning.Learning.repo")
@EntityScan(basePackages = "com.learning.Learning.entity")  // Adjust package name
@SpringBootApplication
public class BootStrapMain {

	public static void main(String[] args) {

		SpringApplication.run(BootStrapMain.class, args);
	}

}
