package controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import model.Student;
import service.StudentService;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

@WebServlet("/students")
public class StudentController implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
      /*  List<Student> studentList = studentService.getAllStudents();
        PrintWriter writer = servletResponse.getWriter();
        writer.println(studentList);*/
        int id = Integer.parseInt(servletRequest.getParameter("id"));
        String name = servletRequest.getParameter("name");
        String phone = servletRequest.getParameter("phone");
        String email = servletRequest.getParameter("email");
        String address = servletRequest.getParameter("address");

        Student student = Student.builder()
                .id(id)
                .name(name)
                .phone(phone)
                .email(email)
                .address(address)
                .build();
        studentService.addStudent(student);

        PrintWriter writer = servletResponse.getWriter();
        writer.println("student record saved successfully.");

    }

    public void addStudent(Student student) {

    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {

    }

    StudentService studentService = new StudentService();

    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

}
