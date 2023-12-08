package jdbc.userInputStatement;

import jdbc.ConnectionUtil;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CourseCrud {
    public static void main(String[] args) throws SQLException {
        //addCourse();
        //updateCourse();
        getCourse();
    }

    public static void addCourse() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the course id, name, price");
        int courseId = scanner.nextInt();
        String courseName = scanner.next();
        int coursePrice = scanner.nextInt();

        //store this in the database

        Connection connection = ConnectionUtil.getConnection();
        Statement statement = connection.createStatement();
        String query = "insert into course(id, course_name, price) values(" + courseId + "," + "'" + courseName + "'," + coursePrice + ")";
        statement.executeUpdate(query);
        System.out.println("Course added");
        connection.close();
    }

    public static void updateCourse() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the course id");
        int courseId = scanner.nextInt();

        System.out.println("Enter the course name to be updated");
        String courseName = scanner.next();

        System.out.println("enter the course price to be update");
        int coursePrice = scanner.nextInt();

        //store this in the database

        Connection connection = ConnectionUtil.getConnection();
        Statement statement = connection.createStatement();
        String query = "update course set course_name='" + courseName + "',  price=" + coursePrice + " where id=" + courseId;
        statement.executeUpdate(query);
        System.out.println("Course updated");
        connection.close();
    }

    public static void getCourse() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the course name");
        String courseName = scanner.next();

        Connection connection = ConnectionUtil.getConnection();
        Statement statement = connection.createStatement();
        String query = "select * from course where course_name like '%" + courseName + "%'";
        ResultSet resultSet = statement.executeQuery(query);
        while (resultSet.next()) {
            System.out.print(resultSet.getInt("id") + "\t");
            System.out.print(resultSet.getString("course_name") + "\t");
            System.out.print(resultSet.getInt("price") + "\t");
            System.out.println();
        }
        connection.close();
    }
}
