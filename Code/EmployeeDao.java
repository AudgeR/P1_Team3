package com.example.Dao;

import java.util.List;

import Models.Employee;


public interface EmployeeDao {
	
	// CREATE
	public int insertEmployee(Employee e);
		
	// READ
	public Employee selectEmployeeByName(String name);
	public List<Employee> selectAllEmployee();
		
	// UPDATE
	public int updateEmployee(Employee e);
		
	// DELETE
	public int deleteEmployee(Employee e);

}