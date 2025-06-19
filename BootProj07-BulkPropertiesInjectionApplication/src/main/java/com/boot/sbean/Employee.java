package com.boot.sbean;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.ToString;

@Component
@Data
@ToString
@ConfigurationProperties(prefix = "com.org")
public class Employee {

	private String ename;
	private String eaddrs;
	private List<String> phoneNumbers;
	private List<String> nickNames;
	private Map<String, Object> aurus;
	private Company company;

}
