package com.boot.dao;

import java.util.List;

import com.boot.model.Employee;

public interface IEmployeeDao {
	 public List<Employee> getEmployeeByDesg(String desg1,String desg2,String desg3); 

}
