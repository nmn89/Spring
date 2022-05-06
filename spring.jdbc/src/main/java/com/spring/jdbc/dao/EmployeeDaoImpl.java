package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.Entities.Employee;

public class EmployeeDaoImpl implements EmployeeDao{
	
	private JdbcTemplate jdbcTemplate;
	
	public int insert(Employee emp) {
		String sql="insert into employee value(?,?,?)";
		int r = this.jdbcTemplate.update(sql, emp.getId(), emp.getName(), emp.getCity());
		return r;	
	}
	
	public int change(Employee emp) {
		String sql="update employee set name=? , city=? where id=?";
		int r = this.jdbcTemplate.update(sql, emp.getName(), emp.getCity(), emp.getId());
		return r;
	}

	public int delete(int empId) {
		String sql="delete from employee where id=?";
		int r = this.jdbcTemplate.update(sql,empId);
		return r;
	}
	
	public Employee getEmployee(int empId) {
		String sql="Select * from employee where id=?";
		RowMapper<Employee> rowMapper=new RowMapperImpl();
		Employee emp=this.jdbcTemplate.queryForObject(sql, rowMapper,empId);
		return emp;
	} 
	
	public List<Employee> getAllEmployees() {
		String sql="Select * from Employee";
		List<Employee> emp = this.jdbcTemplate.query(sql, new RowMapperImpl());
		return emp;
	}
	
	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

}
