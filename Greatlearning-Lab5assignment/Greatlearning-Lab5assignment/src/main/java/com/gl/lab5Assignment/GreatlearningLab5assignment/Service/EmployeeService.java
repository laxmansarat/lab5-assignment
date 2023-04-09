package com.gl.lab5Assignment.GreatlearningLab5assignment.Service;

import java.util.List;

import com.gl.lab5Assignment.GreatlearningLab5assignment.Model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	
	public Employee getEmployee(int id);
	
	public Employee updateEmployee(Employee employee);
	
	public Employee saveEmployee(Employee employee);
	
	public void deleteEmployee(int id);
}
