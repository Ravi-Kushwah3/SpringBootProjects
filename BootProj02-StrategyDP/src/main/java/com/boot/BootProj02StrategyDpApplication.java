package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.boot.sbean.Vehicle;

@SpringBootApplication
@ImportResource("classpath:applicationContext.xml")
public class BootProj02StrategyDpApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj02StrategyDpApplication.class, args);
		ctx.getBean(Vehicle.class).move("Pune","Bangalore");
		ctx.close();
	}

}
