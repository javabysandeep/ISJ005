package com.itshaala;

import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;

import java.util.List;

public class App {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();
        /*courseController.addCourse(Course.builder()
                .courseName("Python")
                .coursePrice(99)
                .topics(List.of("Core Python", "Advance Python", "DJango"))
                .build());*/
        courseController.addCourse(Course.builder()
                        .courseName("Java")
                        .coursePrice(30)
                        .topics(List.of("Core Java","Advance Java","Hibernate","Spring"))
                .build());
    }
}
