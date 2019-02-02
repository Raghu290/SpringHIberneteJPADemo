package com.spring.jpa.service;

import com.example.entity.Employee;

public interface EmployeeService {
	// Method to access data access layer method to insert Employee record
		public void insertEmployee(com.spring.jpa.entity.Employee employee1);
	    // Method to access data access layer method to remove a record
	    public void removeEmployee(int empId);
}
