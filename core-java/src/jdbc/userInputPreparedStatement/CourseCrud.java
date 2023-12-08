package jdbc.userInputPreparedStatement;

import jdbc.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CourseCrud {
    public static void main(String[] args) throws SQLException {
        //addCourse();
        updateCourse();
    }

    public static void addCourse() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the course id, name, price");
        int courseId = scanner.nextInt();
        String courseName = scanner.next();
        int coursePrice = scanner.nextInt();

        //store this in the database

        Connection connection = ConnectionUtil.getConnection();

        String query = "insert into course(id, course_name, price) values(?,?,?)";

        PreparedStatement preparedStatement = connection.prepareStatement(query);

        preparedStatement.setInt(1, courseId);
        preparedStatement.setString(2, courseName);
        preparedStatement.setInt(3, coursePrice);

        preparedStatement.executeUpdate();

        System.out.println("Course addeded");
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
        String query = "update course set course_name=?, price=? where id=?";

        PreparedStatement preparedStatement = connection.prepareStatement(query);
        preparedStatement.setString(1, courseName);
        preparedStatement.setInt(2, coursePrice);
        preparedStatement.setInt(3, courseId);

        preparedStatement.executeUpdate();

        System.out.println("Course updated");
        connection.close();
    }
}
