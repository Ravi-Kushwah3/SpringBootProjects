package com.boot.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class CommandLineRunnerTest implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
	 System.out.println("CommandLineRunnerTest.run()");
	 /*
	  * Read non-option args
	  * 
	  */
	 for(String arg : args) {
		 System.out.println("CMD Runner : "+arg);
	 }
	}

}
