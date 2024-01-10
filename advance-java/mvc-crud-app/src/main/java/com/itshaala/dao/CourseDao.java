package com.itshaala.dao;

import com.itshaala.model.Course;
import com.itshaala.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CourseDao {
    public List<Course> getAllCourses() {
        List<Course> courseList = new ArrayList<>();
        Connection connection = ConnectionUtil.getConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            String query = "select * from it_shaala.course";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Course course = Course.builder()
                        .courseId(resultSet.getInt("id"))
                        .courseName(resultSet.getString("course_name"))
                        .coursePrice(resultSet.getInt("price"))
                        .build();
                courseList.add(course);
            }
        } catch (SQLException e) {
            System.out.println("issue in creating teh statement");
        }
        return courseList;
    }

    public Course getCourseById(int id) {
        Course course = null;
        Connection connection = ConnectionUtil.getConnection();
        Statement statement = null;
        try {
            statement = connection.createStatement();
            String query = "select * from it_shaala.course where id=" + id;
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                course = Course.builder()
                        .courseId(resultSet.getInt("id"))
                        .courseName(resultSet.getString("course_name"))
                        .coursePrice(resultSet.getInt("price"))
                        .build();
            }
        } catch (SQLException e) {
            System.out.println("issue in creating teh statement");
        }
        return course;
    }
}
