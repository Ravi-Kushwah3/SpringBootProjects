package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.controller.EmployeeController;

@SpringBootApplication
public class BootProj04EmployeeDetailsJdbcApplication {

	public static void main(String[] args) {
	ApplicationContext ctx =	SpringApplication.run(BootProj04EmployeeDetailsJdbcApplication.class, args);
	ctx.getBean(EmployeeController.class).getEmployees("Developer", "HR", "Manager")
	.stream().forEach(System.out::println);
	}

}
