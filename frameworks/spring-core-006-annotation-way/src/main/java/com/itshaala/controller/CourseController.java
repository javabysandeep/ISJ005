package com.itshaala.controller;

import com.itshaala.model.Course;
import com.itshaala.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class CourseController {

    //@Autowired
    CourseService courseService;

    Environment environment;

    public void addCourse(Course course) {
        courseService.addCourse(course);
    }
}
