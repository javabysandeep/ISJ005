package controller;

import dao.StudentDao;
import model.Student;
import service.StudentService;

import java.util.List;

public class StudentController {
    StudentService studentService = new StudentService();

    public void addStudent(Student student) {
        studentService.addStudent(student);
    }
    public void updateStudent(Student student) {
        studentService.updateStudent(student);
    }

    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    public void deleteStudent(int id) {
        studentService.deleteStudent(id);
    }
}
