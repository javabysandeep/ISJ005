package com.itshaala.springboot002.service;

import com.itshaala.springboot002.dao.StudentDao;
import com.itshaala.springboot002.model.Student;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentService {
    StudentDao studentDao;

    public List<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public List<Student> getAllStudentsByName(String name) {
        return studentDao.getAllStudentsByName(name);
    }

    public Student getStudentById(int id) {
        return studentDao.getStudentById(id);
    }

    public List<Student> getAllStudentsByAllFields(Student student) {
        return studentDao.getAllStudentsByAllFields(student);
    }

    public void addStudent(Student student) {
        studentDao.addStudent(student);
    }

    public void deleteStudentById(int id) {
        studentDao.deleteStudentById(id);
    }

    public void updateStudent(Student student) {
        studentDao.updateStudent(student);
    }
}