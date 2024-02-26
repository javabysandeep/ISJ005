package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.DispatcherServlet;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@AllArgsConstructor
public class StudentController {

    StudentService studentService;

    @RequestMapping(value = "/student", method = RequestMethod.GET)
    public ModelAndView getAllStudents() {
        List<Student> studentList = studentService.getAllStudents();
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("student");
        modelAndView.addObject("students", studentList);
        studentList.forEach(System.out::println);
        return modelAndView;
    }


    @RequestMapping(value = "/branch/{branchId}/student/{studentId}", method = RequestMethod.GET)
    public ModelAndView getStudentById(@PathVariable("branchId") int branchId, @PathVariable("studentId") int studentId) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("studentById");
        modelAndView.addObject("studentById", studentService.getStudentById(studentId));
        return modelAndView;
    }

    @RequestMapping(value = "/student/filter", method = RequestMethod.GET)
    public ModelAndView getAllStudentsByAllFields(
            @RequestParam(value = "id", required = false) Integer id,
            @RequestParam(value = "name", required = false) String name,
            @RequestParam(value = "email", required = false) String email,
            @RequestParam(value = "phone", required = false) String phone,
            @RequestParam(value = "address", required = false) String address
    ) {
        Student student = Student.builder()
                .id(id)
                .name(name)
                .email(email)
                .phone(phone)
                .address(address)
                .build();
        List<Student> studentList = studentService.getAllStudentsByAllFields(student);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("student");
        modelAndView.addObject("students", studentList);
        studentList.forEach(System.out::println);
        return modelAndView;
    }

}
