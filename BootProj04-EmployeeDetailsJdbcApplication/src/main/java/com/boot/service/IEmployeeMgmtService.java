package com.boot.service;

import java.util.List;

import com.boot.model.Employee;

public interface IEmployeeMgmtService {
	public List<Employee> fetchEmployeesDetails(String desg1, String desg2, String desg3);

}
