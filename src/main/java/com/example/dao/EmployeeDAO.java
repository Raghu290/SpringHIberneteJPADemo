package com.example.dao;

import com.example.entity.Employee;

public interface EmployeeDAO {
    // Method to get all Employees from Employee table
    public void insert(Employee employee);
    // Method to remove a record from Employee table
    public int delete(int empId);
}
