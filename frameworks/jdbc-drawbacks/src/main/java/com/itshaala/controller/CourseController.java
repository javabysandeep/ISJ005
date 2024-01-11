package com.itshaala.controller;

import com.itshaala.model.Course;
import com.itshaala.service.CourseService;

import java.util.List;

public class CourseController {
    CourseService courseService = new CourseService();

    public void createCourse(Course course) {
        courseService.createCourse(course);
    }

    public void updateCourse(Course course) {
        courseService.updateCourse(course);
    }

    public void deleteCourse(int courseId) {
        courseService.deleteCourse(courseId);
    }

    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }


}
