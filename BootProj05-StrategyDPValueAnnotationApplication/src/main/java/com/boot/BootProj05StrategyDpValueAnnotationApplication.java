package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.boot.beans.HotelInfo;

@SpringBootApplication
public class BootProj05StrategyDpValueAnnotationApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(BootProj05StrategyDpValueAnnotationApplication.class, args);
		
		HotelInfo info = ctx.getBean(HotelInfo.class);
		
		info.getRecipt();
	}

}
