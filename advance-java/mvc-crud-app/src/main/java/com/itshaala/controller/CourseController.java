package com.itshaala.controller;

import com.itshaala.model.Course;
import com.itshaala.service.CourseService;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/course")
public class CourseController extends HttpServlet {
    CourseService courseService = new CourseService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Course> courseList = courseService.getAllCourses();
        req.setAttribute("courses", courseList);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("courseListing.jsp");
        requestDispatcher.forward(req, resp);
    }
}
