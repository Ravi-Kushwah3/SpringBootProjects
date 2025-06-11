package com.boot.sbean;

import org.springframework.stereotype.Component;

@Component("cngEngine")
public class CNGEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("CNGEngine.startEngine()");
	}

	@Override
	public void stopEngine() {
		System.out.println("CNGEngine.stopEngine()");
	}

}
