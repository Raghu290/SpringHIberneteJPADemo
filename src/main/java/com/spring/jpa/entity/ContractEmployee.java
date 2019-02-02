package com.spring.jpa.entity;

import javax.persistence.Entity;

@Entity
public class ContractEmployee  extends Employee{

	private String salaryType;

	public String getSalaryType() {
		return salaryType;
	}

	public void setSalaryType(String salaryType) {
		this.salaryType = salaryType;
	}
}
