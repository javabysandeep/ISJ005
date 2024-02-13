package com.itshaala.controller;

import com.itshaala.model.Course;
import com.itshaala.service.CourseService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

@Controller
//@AllArgsConstructor
 public class CourseController {

    @Autowired
    private CourseService courseService;

    public void addCourse(Course course) {
        courseService.addCourse(course);
    }
}
