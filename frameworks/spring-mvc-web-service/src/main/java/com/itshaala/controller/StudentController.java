package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {
    StudentService studentService;

    @GetMapping
    public List<Student> findAll() {
        return studentService.getAllStudents();
    }

    @GetMapping("/{id}")
    public Student getById(@PathVariable("id") int id) {
        return studentService.getStudentById(id);
    }

    @GetMapping("/filter1")
    public List<Student> filterStudents(
            @RequestParam(value = "id", required = false) int id,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "phone", required = false) String phone,
            @RequestParam(value = "address", required = false) String address) {
        Student student = Student.builder()
                .id(id)
                .name(name)
                .email(email)
                .phone(phone)
                .address(address)
                .build();
        return studentService.getAllStudentsByAllFields(student);
    }

    @GetMapping("/filter2")
    public List<Student> filterStudents(@ModelAttribute Student student) {
        return studentService.getAllStudentsByAllFields(student);
    }

    @PostMapping
    public void createStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @PutMapping
    public void updateStudent(@RequestBody Student student) {
        studentService.updateStudent(student);
    }

    @DeleteMapping("/{id}")
    public void deleteStudent(@PathVariable("id") int id) {
        studentService.deleteStudentById(id);
    }
}
