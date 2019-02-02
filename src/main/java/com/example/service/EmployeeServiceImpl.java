package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.EmployeeDAO;
import com.example.entity.Employee;

@Service("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	EmployeeDAO employeeDao;
	public void insertEmployee(Employee employee) {
        employeeDao.insert(employee);
    }
    public int removeEmployee(int empId) {
        return employeeDao.delete(empId);
    }
}
