package controller;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import model.Course;
import service.CourseService;

import java.io.IOException;

//@WebServlet(urlPatterns = "/courses")
public class CourseController implements Servlet {
    CourseService courseService = new CourseService();

    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init method");
    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("CourseController::service method");
        courseService.addCourse(new Course());

    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {
        System.out.println("destroy method");
    }
}
