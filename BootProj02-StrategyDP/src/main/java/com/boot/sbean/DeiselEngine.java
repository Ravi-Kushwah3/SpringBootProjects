package com.boot.sbean;

import org.springframework.stereotype.Component;

@Component("deiselEngine")
public class DeiselEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("DeiselEngine.startEngine()");
	}

	@Override
	public void stopEngine() {
		System.out.println("DeiselEngine.stopEngine()");
	}

}
