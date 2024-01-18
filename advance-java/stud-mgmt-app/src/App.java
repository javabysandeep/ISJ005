import controller.StudentController;
import model.Student;

import java.util.List;

public class App {
    public static void main(String[] args) {
        StudentController studentController = new StudentController();
        /*Student student = Student.builder()
                .id(101)
                .name("Ganesh")
                .email("ganesh@itshaala.com")
                .phone("9898")
                .address("Pune")
                .build();*/
        //studentController.addStudent(student);
        List<Student> allStudents = studentController.getAllStudents();
        System.out.println("Before deletion ");
        allStudents.forEach(System.out::println);

        studentController.deleteStudent(121);

        System.out.println("After deletion");
        allStudents = studentController.getAllStudents();
        allStudents.forEach(System.out::println);

        System.out.println("After updation");
        Student studentToBeUpdated = Student.builder()
                .id(101)
                .name("Ganesh Lastname")
                .email("ganesh.123@gmail.com")
                .address("Baramati")
                .phone("1234567890")
                .build();
        studentController.updateStudent(studentToBeUpdated);
    }
}