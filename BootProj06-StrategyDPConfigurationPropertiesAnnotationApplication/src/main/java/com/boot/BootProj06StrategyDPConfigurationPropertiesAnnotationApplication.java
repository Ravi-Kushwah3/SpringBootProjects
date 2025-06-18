package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.bean.StudentBean;

@SpringBootApplication
public class BootProj06StrategyDPConfigurationPropertiesAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj06StrategyDPConfigurationPropertiesAnnotationApplication.class, args);
		StudentBean student = ctx.getBean(StudentBean.class);
		
		System.out.println("Student data from properties : "+student);
	}

}
