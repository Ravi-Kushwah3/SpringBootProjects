package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.boot.sbean.Flipkart;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class BootProj03EccomerceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj03EccomerceApplication.class, args);
		String[] items = {"Laptop", "Mobile", "Headphones"};
		ctx.getBean(Flipkart.class).shopping(items, "Pune 411044");
	}

}
