package com.boot.sbean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Flipkart {
	
	@Autowired
	@Qualifier("delever")
	private ICourier courier;
	
	public void shopping(String[] items, String address) {
		System.out.println("Flipkart.shopping()");
		courier.deliver(items, address);
	}

}
