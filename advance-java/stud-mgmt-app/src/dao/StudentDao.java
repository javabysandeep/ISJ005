package dao;

import model.Student;
import util.JdbcConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {
    public void addStudent(Student student) {
        Connection connection = JdbcConnectionUtil.getConnection();
        String query = "insert into student(id,name,email, phone,address) values(?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setString(3, student.getEmail());
            preparedStatement.setString(4, student.getPhone());
            preparedStatement.setString(5, student.getAddress());
            preparedStatement.executeUpdate();
            System.out.println("student added successfully");
        } catch (SQLException e) {
            System.out.println("query ex");
        }

    }

    public void updateStudent(Student student) {
        Connection connection = JdbcConnectionUtil.getConnection();
        String query = "update student set name=?, email=?, phone=?, address=? where id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getEmail());
            preparedStatement.setString(3, student.getPhone());
            preparedStatement.setString(4, student.getAddress());
            preparedStatement.setInt(5, student.getId());
            preparedStatement.executeUpdate();
            System.out.println("student updated successfully");
        } catch (SQLException e) {
            System.out.println("query ex");
        }

    }

    public List<Student> getAllStudents() {
        List<Student> students = new ArrayList<>();
        Connection connection = JdbcConnectionUtil.getConnection();
        try {
            Statement statement = connection.createStatement();
            String sql = "select * from student";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Student student = Student.builder()
                        .id(resultSet.getInt("id"))
                        .name(resultSet.getString("name"))
                        .email(resultSet.getString("email"))
                        .phone(resultSet.getString("phone"))
                        .address(resultSet.getString("address"))
                        .build();
                students.add(student);

            }
        } catch (SQLException e) {

        }


        return students;
    }

    public void deleteStudent(int id) {
        Connection connection = JdbcConnectionUtil.getConnection();
        String query = "delete from student where id=?";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("Record deleted");
        } catch (SQLException e) {

        }
    }
}
