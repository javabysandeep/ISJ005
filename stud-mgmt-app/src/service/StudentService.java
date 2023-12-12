package service;

import dao.StudentDao;
import model.Student;
import util.JdbcConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class StudentService {
    StudentDao studentDao = new StudentDao();

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }

    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public void deleteStudent(int id) {
        studentDao.deleteStudent(id);
    }
}
