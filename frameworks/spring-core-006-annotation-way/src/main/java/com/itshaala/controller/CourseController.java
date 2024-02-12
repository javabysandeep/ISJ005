package com.itshaala.controller;

import com.itshaala.model.Course;
import com.itshaala.service.CourseService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@AllArgsConstructor
public class CourseController {

    CourseService courseService;

    public void addCourse(Course course) {
        courseService.addCourse(course);
    }
}
