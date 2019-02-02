package com.spring.jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.spring.jpa.service.EmployeeService;
import com.example.dao.EmployeeDAO;


import com.spring.jpa.doa.EmployeeRepository;
import com.spring.jpa.entity.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeRepository employeeRepository;
	public void insertEmployee(Employee employee) {
		employeeRepository.saveAndFlush(employee);
    }
    public void removeEmployee(int empId) {
    	Employee emp = (Employee)employeeRepository.findById(empId).get();
		 employeeRepository.delete(emp);
    }
	
}

