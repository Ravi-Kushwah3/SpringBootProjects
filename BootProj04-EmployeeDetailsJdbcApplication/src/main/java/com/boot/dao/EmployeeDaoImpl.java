package com.boot.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.boot.model.Employee;

@Repository
public class EmployeeDaoImpl implements IEmployeeDao  {
	
	private static final String emp_query = "SELECT empName,empDesg,empId,empSalary FROM EMPLOYEEDETAILS WHERE EMPDESG IN (?,?,?) ORDER BY EMPDESG";
	
	@Autowired
	private DataSource datasource;

	@Override
	public List<Employee> getEmployeeByDesg(String desg1, String desg2, String desg3) {
		 System.out.println("EmployeeDaoImpl.getEmployeeByDesg()");
		 List<Employee> empList = new ArrayList<Employee>();
			try (Connection conn = datasource.getConnection();
					PreparedStatement stmt = conn.prepareStatement(emp_query);) {
				stmt.setString(1, desg1);
				stmt.setString(2, desg2);
				stmt.setString(3, desg3);
                ResultSet rs = stmt.executeQuery();
                
                while(rs.next()) {
                	Employee emp =  new Employee();
                	emp.setEmpName(rs.getString("empName"));
                	emp.setEmpId(rs.getString("empId"));
                	emp.setEmpDesg(rs.getString("empDesg"));
                	emp.setEmpSalary(rs.getString("empSalary"));
                	empList.add(emp);
                }
 
		 }catch(Exception e) {
			 e.printStackTrace();
		 }
		return empList;
	}

}
