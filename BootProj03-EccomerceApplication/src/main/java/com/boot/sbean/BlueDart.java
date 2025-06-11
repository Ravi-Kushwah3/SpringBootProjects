package com.boot.sbean;

import java.util.Arrays;

import org.springframework.stereotype.Component;

@Component("blueDart")
public class BlueDart implements ICourier {

	@Override
	public void deliver(String []items, String address) {
		 System.out.println("BlueDart.deliver(item: "+Arrays.toString(items)+", address: "+address);

	}

}
