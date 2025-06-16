package com.boot.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("hotelinfo")
public class HotelInfo {
 
	@Value("${hotel.name}")
	private String hotelName;
	
	@Value("${cus.name}")
	private String custName;
	
	@Value("${cus.billAmt}")
    private String billAmt;
	
	@Autowired
	private HotelMenu menu;
 
	public void getRecipt() {
		
		System.out.println("Hotel Menu : "+menu);
		System.out.println("Hotel Name : "+hotelName);
		System.out.println("Customer info : "+custName +" and bill : "+billAmt);
		
	}
	
	

}
