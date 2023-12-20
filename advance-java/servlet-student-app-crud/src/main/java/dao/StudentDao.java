package dao;

import model.Student;
import util.ConnectionUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDao {

    public void addStudent(Student student) {
        Connection connection = ConnectionUtil.getConnection();
        String sql = "insert into student(id,name,email, phone,address) values(?,?,?,?,?)";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, student.getId());
            preparedStatement.setString(2, student.getName());
            preparedStatement.setString(3, student.getEmail());
            preparedStatement.setString(4, student.getPhone());
            preparedStatement.setString(5, student.getAddress());
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            System.out.println("issue in prepared statement");
        } finally {
            try {
                connection.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public List<Student> getAllStudents() {
        List<Student> studentList = new ArrayList<Student>();
        Connection connection = ConnectionUtil.getConnection();
        try {
            Statement statement = connection.createStatement();
            String sql = "select * from student";
            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                Student student = Student.builder()
                        .id(resultSet.getInt("id"))
                        .name(resultSet.getString("name"))
                        .phone(resultSet.getString("phone"))
                        .email(resultSet.getString("email"))
                        .address(resultSet.getString("address"))
                        .build();
                studentList.add(student);
            }
        } catch (SQLException e) {
            System.out.println("issue in executing the query");
        }
        return studentList;
    }


}
