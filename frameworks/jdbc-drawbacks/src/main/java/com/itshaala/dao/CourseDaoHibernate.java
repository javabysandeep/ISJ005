package com.itshaala.dao;

import com.itshaala.model.Course;
import com.itshaala.util.ConnectionUtil;
import com.itshaala.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDaoHibernate {
    public void createCourse(Course course) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.save(course);
        transaction.commit();
        session.close();
    }

    public void updateCourse(Course course) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.update(course);
        transaction.commit();
        session.close();
    }

    public void deleteCourse(int courseId) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();
        session.delete(courseId);
        transaction.commit();
        session.close();
    }

    public List<Course> getAllCourses() {
        return null;
    }
}
