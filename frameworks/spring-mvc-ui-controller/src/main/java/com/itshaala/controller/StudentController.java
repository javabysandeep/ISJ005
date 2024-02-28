package com.itshaala.controller;

import com.itshaala.model.Student;
import com.itshaala.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {
    //crud
    StudentService studentService;

    @GetMapping
    public ModelAndView findAll() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("list");
        List<Student> listOfStudents = studentService.getAllStudents();
        modelAndView.addObject("listOfStudents", listOfStudents);
        return modelAndView;
    }

    @GetMapping("/{id}")
    public ModelAndView getById(@PathVariable("id") int id) {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("list");
        Student studentById = studentService.getStudentById(id);
        modelAndView.addObject("listOfStudents", studentById);
        return modelAndView;
    }

    @GetMapping("/filter1")
    public ModelAndView filterStudents(
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
        List<Student> listOfStudents = studentService.getAllStudentsByAllFields(student);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("list");
        modelAndView.addObject("listOfStudents", listOfStudents);
        return modelAndView;
    }

    @GetMapping("/filter2")
    public ModelAndView filterStudents(@ModelAttribute Student student) {
        List<Student> listOfStudents = studentService.getAllStudentsByAllFields(student);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("list");
        modelAndView.addObject("listOfStudents", listOfStudents);
        return modelAndView;
    }

    @GetMapping("/create")
    public ModelAndView createStudentForm() {
        ModelAndView view = new ModelAndView();
        view.setViewName("createStudentForm");
        return view;
    }

    @PostMapping("/create")
    public String createStudent(@ModelAttribute Student student) {
        studentService.addStudent(student);
        return "redirect:/student";
    }
    @GetMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") int id) {
        studentService.deleteStudentById(id);
        return "redirect:/student";
    }
}
