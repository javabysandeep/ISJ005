package com.itshaala;


import com.itshaala.controller.CourseController;
import com.itshaala.dao.CourseDaoHibernate;
import com.itshaala.dao.CourseDaoJdbc;
import com.itshaala.model.Course;

public class HibernateApp {
    public static void main(String[] args) {
        CourseDaoHibernate courseDaoHibernate = new CourseDaoHibernate();
        courseDaoHibernate.updateCourse(Course.builder()
                        .courseId(52)
                .courseName("Hibernate master class")
                .coursePrice(99999)
                .build());
        CourseDaoJdbc courseDaoJdbc = new CourseDaoJdbc();
        courseDaoJdbc.getAllCourses().forEach(System.out::println);
    }
}
