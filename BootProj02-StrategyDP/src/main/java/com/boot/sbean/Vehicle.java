package com.boot.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public final class Vehicle {
	@Autowired
	@Qualifier("engine")
	private IEngine engine;
	
	public void move(String source,String destination) {
		engine.startEngine();
		System.out.println("Journey from "+source+" to "+ destination);
		engine.stopEngine();
		System.out.println("Journey completed");
	}

}
