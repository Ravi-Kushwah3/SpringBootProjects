package com.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.boot.model.Employee;
import com.boot.service.IEmployeeMgmtService;

@Controller
public class EmployeeController {

	@Autowired
	private IEmployeeMgmtService empService;

	public List<Employee> getEmployees(String desg1, String desg2, String desg3) {
		List<Employee> empList = empService.fetchEmployeesDetails(desg1, desg2, desg3);
		return empList;
	}

}
