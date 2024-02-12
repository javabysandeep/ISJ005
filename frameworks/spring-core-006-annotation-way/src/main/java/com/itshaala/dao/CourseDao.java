package com.itshaala.dao;

import com.itshaala.model.Course;
import org.springframework.stereotype.Repository;

@Repository
public class CourseDao {
    public void addCourse(Course course) {
        System.out.println("Course Added " + course);
    }
}
