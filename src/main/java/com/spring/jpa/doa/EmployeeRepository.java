package com.spring.jpa.doa;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.jpa.entity.Employee;


@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Integer>	 {
   
}
    