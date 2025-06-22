package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootProj09ProfileActivationApplication {

	public static void main(String[] args) {
		System.out.println("BootProj09ProfileActivationApplication.main()");
		ApplicationContext ctx = SpringApplication.run(BootProj09ProfileActivationApplication.class, args);
		
	}

}
