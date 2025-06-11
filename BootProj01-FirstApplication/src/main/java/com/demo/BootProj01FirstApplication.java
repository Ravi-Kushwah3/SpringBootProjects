package com.demo;
 
import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.demo.wish.WishMessagerGenerator;

@SpringBootApplication
public class BootProj01FirstApplication {
	
	@Bean(name="ldt")
	public LocalDateTime createLDT() {
		return LocalDateTime.now();
	}

	public static void main(String[] args) {
		BootProj01FirstApplication boot = new BootProj01FirstApplication();
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj01FirstApplication.class, args);
		WishMessagerGenerator wmg = ctx.getBean(WishMessagerGenerator.class);
		String usrname = ctx.getEnvironment().getProperty("myusername"); 
		String msg = wmg.generateMessage(usrname);
		System.out.println(msg);
	}

}
