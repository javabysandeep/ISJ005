package com.itshaala.service;

import com.itshaala.dao.StudentDao;
import com.itshaala.model.Student;

import java.util.List;

public class StudentService {
    StudentDao studentDao = new StudentDao();

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public void deleteStudent(int studentId) {
        studentDao.deleteStudent(studentId);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }
}
