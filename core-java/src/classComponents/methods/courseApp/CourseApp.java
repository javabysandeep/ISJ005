package classComponents.methods.courseApp;


import java.util.Scanner;

public class CourseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the course name, course price, course duration, course description");

        Course course = new Course();
        course.courseName = scanner.nextLine();
        course.coursePrice = scanner.nextInt();
        course.courseDuration = scanner.nextLine();
        course.courseDescription = scanner.nextLine();


        CourseController courseController = new CourseController();
        courseController.addCourse(course);

    }
}
