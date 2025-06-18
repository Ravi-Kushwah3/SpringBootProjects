package com.boot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component("student")
@ConfigurationProperties(prefix = "student.info")
public class StudentBean {
	
	private String name;
	private String age;
	private String city;
	private String clazz;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getClazz() {
		return clazz;
	}
	public void setClazz(String clazz) {
		this.clazz = clazz;
	}
	@Override
	public String toString() {
		return "StudentBean [name=" + name + ", age=" + age + ", city=" + city + ", clazz=" + clazz + "]";
	}
	
	

}
