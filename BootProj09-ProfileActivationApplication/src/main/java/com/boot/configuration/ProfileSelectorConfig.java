package com.boot.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

@Configuration
public class ProfileSelectorConfig {
	
	@Autowired
	private Environment env;
	
	@Bean
	@Profile(value = "uat")
	String createUatDB() {
		System.out.println("ProfileSelectorConfig.createUatDB()");
		System.out.println("Database : "+env.getProperty("database.name"));
		System.out.println("Servr : "+env.getProperty("server.name"));

		return null;
	}
	
	@Bean
	@Profile(value = "prod")
	String createProdDB() {
		System.out.println("ProfileSelectorConfig.createProdDB()");
		System.out.println("Database : "+env.getProperty("database.name"));
		System.out.println("Servr : "+env.getProperty("server.name"));

		return null;
	}
	
	@Bean
	@Profile(value = "dev")
	String createDevDB() {
		System.out.println("ProfileSelectorConfig.createDevDB()");
		System.out.println("Database : "+env.getProperty("database.name"));
		System.out.println("Servr : "+env.getProperty("server.name"));

		return null;
	}
	

}
