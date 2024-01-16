package com.itshaala;


import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;

public class App {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();

        //1. create
       /* courseController.addCourse(Course.builder()
                .courseName("Spring Security")
                .coursePrice(99)
                .build());*/
        //2. update
       /* courseController.updateCourse(Course.builder()
                .courseId(102)
                .courseName("Spring Security updated in 2024")
                .coursePrice(199)
                .build());*/

        //3. Delete
        courseController.deleteCourse(102);

    }
}
