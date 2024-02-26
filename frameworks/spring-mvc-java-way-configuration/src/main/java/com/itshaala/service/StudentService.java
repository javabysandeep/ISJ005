package com.itshaala.service;

import com.itshaala.dao.StudentDao;
import com.itshaala.model.Student;
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
}
