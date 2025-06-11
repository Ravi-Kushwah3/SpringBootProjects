package com.boot.sbean;

import org.springframework.stereotype.Component;

@Component("petrolEngine")
public class PetrolEngine implements IEngine {

	@Override
	public void startEngine() {
		System.out.println("PetrolEngine.startEngine()");
	}

	@Override
	public void stopEngine() {
		System.out.println("PetrolEngine.stopEngine()");
	}

}
