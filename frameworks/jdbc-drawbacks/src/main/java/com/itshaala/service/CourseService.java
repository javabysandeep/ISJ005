package com.itshaala.service;

import com.itshaala.dao.CourseDaoJdbc;
import com.itshaala.model.Course;

import java.util.List;

public class CourseService {
    CourseDaoJdbc courseDaoJdbc = new CourseDaoJdbc();

    public void createCourse(Course course) {
        courseDaoJdbc.createCourse(course);
    }

    public void updateCourse(Course course) {
        courseDaoJdbc.updateCourse(course);
    }

    public void deleteCourse(int courseId) {
        courseDaoJdbc.deleteCourse(courseId);
    }

    public List<Course> getAllCourses() {
        return courseDaoJdbc.getAllCourses();
    }
}
