package com.itshaala.springboot002.controller;

import com.itshaala.springboot002.model.Student;
import com.itshaala.springboot002.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@AllArgsConstructor
public class StudentController {
    StudentService studentService;

    public List<Student> findAll() {
        return studentService.getAllStudents();
    }

    public Student getById(int id) {
        return studentService.getStudentById(id);
    }

    public List<Student> filterStudents(int id, String name, String email, String phone, String address) {
        Student student = Student.builder()
                .id(id)
                .name(name)
                .email(email)
                .phone(phone)
                .address(address)
                .build();
        return studentService.getAllStudentsByAllFields(student);
    }

    public List<Student> filterStudents(Student student) {
        return studentService.getAllStudentsByAllFields(student);
    }

    public void createStudent(Student student) {
        studentService.addStudent(student);
    }

    public void updateStudent(Student student) {
        studentService.updateStudent(student);
    }

    public void deleteStudent(int id) {
        studentService.deleteStudentById(id);
    }
}