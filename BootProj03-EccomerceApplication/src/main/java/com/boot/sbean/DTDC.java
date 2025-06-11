package com.boot.sbean;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component("dtdc")
public class DTDC implements ICourier {

	@Override
	public void deliver(String[] items, String address) {
		 System.out.println("DTDC.deliver(item: "+Arrays.toString(items)+", address: "+address);


	}

}
