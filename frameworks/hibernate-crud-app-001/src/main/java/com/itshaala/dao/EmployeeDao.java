package com.itshaala.dao;

import com.itshaala.model.Employee;
import com.itshaala.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class EmployeeDao {
    public void addEmployee(Employee employee) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        transaction.commit();
        System.out.println("Employee object saved");
        session.close();
    }


    public Employee getEmployee(int id) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Employee employee = session.get(Employee.class, id);
        session.close();
        return employee;
    }
}
