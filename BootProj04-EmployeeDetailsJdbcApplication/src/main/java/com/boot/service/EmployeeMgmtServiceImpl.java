package com.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.IEmployeeDao;
import com.boot.model.Employee;

@Service
public class EmployeeMgmtServiceImpl implements IEmployeeMgmtService {
	
	@Autowired
	private IEmployeeDao empDao;

	@Override
	public List<Employee> fetchEmployeesDetails(String desg1, String desg2, String desg3) {
		List<Employee> empList = empDao.getEmployeeByDesg(desg1, desg2, desg3);
		return empList;
	}

}
