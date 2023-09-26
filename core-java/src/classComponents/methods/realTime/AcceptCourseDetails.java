package classComponents.methods.realTime;

import java.util.Scanner;

public class AcceptCourseDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the course name, course price, course duration, course description");
        String courseName = scanner.nextLine();
        int coursePrice = scanner.nextInt();
        String courseDuration = scanner.nextLine();
        String courseDescription = scanner.nextLine();

        printCourseDetails(courseName, coursePrice, courseDuration, courseDescription);
    }

    private static void printCourseDetails(String courseName, int coursePrice, String courseDuration, String courseDescription) {
        m1(courseName, coursePrice, courseDuration, courseDescription);
    }

    private static void m1(String courseName, int coursePrice, String courseDuration, String courseDescription) {
        m2(courseName, coursePrice, courseDuration, courseDescription);
    }

    private static void m2(String courseName, int coursePrice, String courseDuration, String courseDescription) {
        m3(courseName, coursePrice, courseDuration, courseDescription);
    }

    private static void m3(String courseName, int coursePrice, String courseDuration, String courseDescription) {
        System.out.println("Course Name : " + courseName);
        System.out.println("Course Price : " + coursePrice);
        System.out.println("Course Duration : " + courseDuration);
        System.out.println("Course Description : " + courseDescription);
    }
}
