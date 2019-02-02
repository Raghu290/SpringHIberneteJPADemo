package com.example.client;

import java.util.Scanner;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.entity.ContractEmployee;
import com.example.entity.Employee;
import com.example.entity.RegularEmployee;
import com.example.service.EmployeeService;

public class ClientLogic {
	public static void main(String arg[]) {
        AbstractApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
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
       // System.out.println("Enter the empid to be deleted ");
        //Scanner scanner = new Scanner(System.in);
       // int empId = scanner.nextInt();
        // Invoking Service layer method to remove Employee details from
        // Employee table
       // int result = employeeService.removeEmployee(empId);
       // if (result == 1) {
         //   System.out.println(" Record deleted successfully ");
        //} else {
          //  System.out.println(" No record found for the given empid ");
        //}
        //scanner.close();
        ctx.close();
    }

}
