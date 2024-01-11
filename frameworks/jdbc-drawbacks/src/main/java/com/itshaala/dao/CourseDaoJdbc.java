package com.itshaala.dao;

import com.itshaala.model.Course;
import com.itshaala.util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CourseDaoJdbc {
    public void createCourse(Course course) {
        Connection connection = ConnectionUtil.getConnection();
        String query = "insert into it_shaala.course(id, course_name, price) VALUES (?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, course.getCourseId());
            preparedStatement.setString(2, course.getCourseName());
            preparedStatement.setInt(3, course.getCoursePrice());
            preparedStatement.executeUpdate();
            System.out.println("Course created");
        } catch (SQLException e) {
            System.out.println("sql exception " + e.getMessage());
        }
    }

    public void updateCourse(Course course) {
        Connection connection = ConnectionUtil.getConnection();
        String query = "update it_shaala.course set course_name=?, price=? where id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, course.getCourseName());
            preparedStatement.setInt(2, course.getCoursePrice());
            preparedStatement.setInt(3, course.getCourseId());
            preparedStatement.executeUpdate();
            System.out.println("Course updated");
        } catch (SQLException e) {
            System.out.println("sql exception " + e.getMessage());
        }
    }

    public void deleteCourse(int courseId) {
        Connection connection = ConnectionUtil.getConnection();
        String query = "delete from it_shaala.course where id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, courseId);
            preparedStatement.executeUpdate();
            System.out.println("Course deleted");
        } catch (SQLException e) {
            System.out.println("sql exception " + e.getMessage());
        }
    }

    public List<Course> getAllCourses() {
        List<Course> courseList = new ArrayList<>();
        Connection connection = ConnectionUtil.getConnection();
        String query = "select * from it_shaala.course";
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                Course course = Course.builder()
                        .courseId(resultSet.getInt("id"))
                        .courseName(resultSet.getString("course_name"))
                        .coursePrice(resultSet.getInt("price"))
                        .build();
                courseList.add(course);
            }
        } catch (SQLException e) {
            System.out.println("sql exception " + e.getMessage());
        }

        return courseList;
    }
}
