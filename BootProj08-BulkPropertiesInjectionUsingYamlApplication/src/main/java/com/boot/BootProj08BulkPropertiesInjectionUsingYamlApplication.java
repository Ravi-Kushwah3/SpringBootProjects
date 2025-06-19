package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.sbean.Employee;

@SpringBootApplication
public class BootProj08BulkPropertiesInjectionUsingYamlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj08BulkPropertiesInjectionUsingYamlApplication.class, args);
		Employee emp = ctx.getBean(Employee.class);
		System.out.println(emp);
	}

}
