package com.example.dao;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.entity.Employee;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO {
    private SessionFactory sessionFactory;
    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
// Method to insert record into Employee table
    public void insert(Employee Employee) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(Employee);
        tx.commit();
        session.close();
        EntityManager r;
       
    }
    // Method to remove record from Employee table
    public int delete(int empId) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        int result = 0;
        try {
            Employee emp = (Employee) session.get(Employee.class, empId);
            session.delete(emp);
            result = 1;
            tx.commit();
        } catch (Exception exp) {
            tx.rollback();
        }
        session.close();
        return result;
    }
}
    