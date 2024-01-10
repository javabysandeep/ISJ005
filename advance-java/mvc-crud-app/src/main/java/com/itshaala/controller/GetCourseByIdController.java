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

@WebServlet("/test")
public class GetCourseByIdController extends HttpServlet {
    CourseService courseService = new CourseService();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("id"));
        resp.setContentType("text/html");

        Course course = courseService.getCourseById(id);
        req.setAttribute("course", course);
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("courseListingById.jsp");
        requestDispatcher.forward(req, resp);
    }
}
