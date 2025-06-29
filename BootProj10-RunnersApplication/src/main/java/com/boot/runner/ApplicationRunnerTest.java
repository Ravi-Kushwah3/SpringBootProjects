package com.boot.runner;

import java.util.Set;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
@Component
public class ApplicationRunnerTest implements ApplicationRunner {

	@Override
	public void run(ApplicationArguments args) throws Exception {
	 System.out.println("ApplicationRunnerTest.run()");
	 
	 /*
	  * Application Runner support args as option-args like : --name = ravi
	  * 
	  */
	 
	System.out.println("Non-Option args : "+ args.getNonOptionArgs());
	 
	System.out.println("Option args : "+ args.getOptionNames());
	System.out.println("Option args : "+ args.getOptionValues("name"));


	}

}
