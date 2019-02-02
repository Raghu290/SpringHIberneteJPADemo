package com.example.entity;

import javax.persistence.Entity;

@Entity
public class RegularEmployee extends Employee{
	private String salaryType;

	public String getSalaryType() {
		return salaryType;
	}

	public void setSalaryType(String salaryType) {
		this.salaryType = salaryType;
	}
}
