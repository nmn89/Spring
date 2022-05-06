package com.spring.jdbc.dao;

import java.util.List;

import com.spring.jdbc.Entities.Employee;

public interface EmployeeDao {
	public int insert(Employee emp);
	public int change(Employee emp);
	public int delete(int empId);
	public Employee getEmployee(int empId);
	public List<Employee> getAllEmployees();
}
