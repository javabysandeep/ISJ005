package com.itshaala;


import com.itshaala.controller.CourseController;
import com.itshaala.model.Course;

public class App {
    public static void main(String[] args) {
        CourseController courseController = new CourseController();
        // Create : -->
       /* courseController.createCourse(Course.builder()
                .courseId(4)
                .courseName("JDBC Drawbacks")
                .coursePrice(100)
                .build());*/
        //update
     /*   courseController.updateCourse(Course.builder()
                .courseId(4)
                .courseName("JDBC Drawbacks")
                .coursePrice(15000)
                .build());*/

        //delete
        courseController.deleteCourse(4);
        //Read: -->
        courseController.getAllCourses().forEach(System.out::println);
    }
}
