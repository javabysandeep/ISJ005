import controller.StudentController;
import model.Student;

import java.util.List;

public class UpdateApp {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        System.out.println("Before update");
        List<Student> allStudents = studentController.getAllStudents();
        allStudents.forEach(System.out::println);

        Student studentToBeUpdated = Student.builder()
                .id(101)
                .name("Ganesh Lastname")
                .email("ganesh.123@gmail.com")
                .address("Baramati")
                .phone("1234567890")
                .build();
        studentController.updateStudent(studentToBeUpdated);
        System.out.println("After update");
        allStudents = studentController.getAllStudents();
        allStudents.forEach(System.out::println);
    }
}