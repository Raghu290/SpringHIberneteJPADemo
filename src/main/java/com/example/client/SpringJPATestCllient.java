package com.example.client;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jpa.entity.ContractEmployee;
import com.spring.jpa.entity.Employee;
import com.spring.jpa.entity.RegularEmployee;
import com.spring.jpa.service.EmployeeService;



public class SpringJPATestCllient {
	public static void main(String arg[]) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("config-xml.xml");
        EmployeeService employeeService = (EmployeeService) ctx.getBean("employeeService");
        // Create Employee instances
        Employee employee1 = new Employee(1001, "Alex", "Account");
        RegularEmployee employee2 = new RegularEmployee();
        employee2.setDepartment("Science");
        employee2.setEmpId(1002);
        employee2.setEmpName("Raghu");
        employee2.setSalaryType("fixed");
        
        ContractEmployee employee3 = new ContractEmployee();
        employee3.setDepartment("Science");
        employee3.setEmpId(1003);
        employee3.setEmpName("Ram");
        employee3.setSalaryType("Not fixed");
        // Invoking Service layer method to insert Employee details into
        // Employee table
        employeeService.insertEmployee(employee1);
        employeeService.insertEmployee(employee2);
        employeeService.insertEmployee(employee3);
        System.out.println("Records are successfully added..");
	}
}
