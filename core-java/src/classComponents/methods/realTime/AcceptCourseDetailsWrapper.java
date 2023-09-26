package classComponents.methods.realTime;

import java.util.Scanner;

public class AcceptCourseDetailsWrapper {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the course name, course price, course duration, course description");

        Course course = new Course();
        course.courseName = scanner.nextLine();
        course.coursePrice = scanner.nextInt();
        course.courseDuration = scanner.nextLine();
        course.courseDescription = scanner.nextLine();

        printCourseDetails(course);
    }

    static void printCourseDetails(Course course) {
        m1(course);
    }

    static void m1(Course course) {
        m2(course);
    }

    static void m2(Course course) {
        m3(course);
    }

    static void m3(Course course) {
        System.out.println("Course Name : " + course.courseName);
        System.out.println("Course Price : " + course.coursePrice);
        System.out.println("Course Duration : " + course.courseDuration);
        System.out.println("Course Description : " + course.courseDescription);
    }
}
