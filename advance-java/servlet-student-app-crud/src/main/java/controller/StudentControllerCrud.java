package controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Student;
import service.StudentService;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/studentsCrud")
public class StudentControllerCrud extends HttpServlet {

    StudentService studentService = new StudentService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Student> studentList = studentService.getAllStudents();
        PrintWriter writer = resp.getWriter();
        writer.println(studentList);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String phone = req.getParameter("phone");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        Student student = Student.builder()
                .id(id)
                .name(name)
                .phone(phone)
                .email(email)
                .address(address)
                .build();
        studentService.addStudent(student);
        PrintWriter writer = resp.getWriter();
        writer.println("student record saved successfully.");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        studentService.deleteStudent(id);
        PrintWriter writer = resp.getWriter();
        writer.println("student record deleted successfully.");
    }
}
