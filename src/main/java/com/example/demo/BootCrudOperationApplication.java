package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication(scanBasePackages="com")
@EntityScan(basePackages="com.example.demo.model")
@EnableJpaRepositories(basePackages="com.example.demo.dao")
public class BootCrudOperationApplication {

	public static void main(String[] args) 
	{
			
		SpringApplication.run(BootCrudOperationApplication.class);
			
		
	}
}



