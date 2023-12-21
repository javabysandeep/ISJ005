package controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import model.Student;
import service.StudentService;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


@WebServlet("/servlet1")
public class Servlet1 extends GenericServlet {
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        servletResponse.getWriter().println("servlet developed using Generic servlet");
    }
}
