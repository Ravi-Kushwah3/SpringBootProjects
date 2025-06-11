package com.demo.wish;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
 
@Component
public class WishMessagerGenerator {
	// HAS-A Property
	@Autowired
	public LocalDateTime ldt;
	
	public String generateMessage(String user) {
		int hour = ldt.getHour();
		if(hour<12) {
			return "GM "+user;
		}
		else if(hour<16) {
			return "GA "+user;
		}
		else if(hour<20) {
			return "GE "+user;
		}else{
			return "GN "+user;
		}
	}

}
