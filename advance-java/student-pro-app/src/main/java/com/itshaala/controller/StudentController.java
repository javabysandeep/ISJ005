package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

@WebServlet("/student")
public class StudentController extends HttpServlet {

    StudentService studentService = new StudentService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> students = studentService.getAllStudents();
        PrintWriter writer = resp.getWriter();
        writer.println("List of students");
        writer.println(students);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //read form details
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");
        Date dob = Date.valueOf(req.getParameter("dob"));
        String nationality = req.getParameter("nationality");
        //build student object and forward to service

        Student student = Student.builder()
                .studentName(name)
                .studentAddress(address)
                .studentPhone(phone)
                .studentEmail(email)
                .studentGender(gender)
                .studentDob(dob)
                .studentNationality(nationality)
                .build();

        studentService.addStudent(student);

        PrintWriter writer = resp.getWriter();
        writer.println("Student added successfully");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int studentId = Integer.parseInt(req.getParameter("student_id"));
        studentService.deleteStudent(studentId);
        PrintWriter writer = resp.getWriter();
        writer.println("Student deleted successfully");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //read form details
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String address = req.getParameter("address");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String gender = req.getParameter("gender");
        Date dob = Date.valueOf(req.getParameter("dob"));
        String nationality = req.getParameter("nationality");
        //build student object and forward to service

        Student student = Student.builder()
                .studentId(id)
                .studentName(name)
                .studentAddress(address)
                .studentPhone(phone)
                .studentEmail(email)
                .studentGender(gender)
                .studentDob(dob)
                .studentNationality(nationality)
                .build();

        studentService.updateStudent(student);

        PrintWriter writer = resp.getWriter();
        writer.println("Student updated successfully");
    }
}
