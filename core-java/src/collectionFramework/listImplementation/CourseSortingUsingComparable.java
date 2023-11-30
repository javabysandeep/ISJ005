package collectionFramework.listImplementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CourseSortingUsingComparable {
    public static void main(String[] args) {
        List<Course> courses = getCourses();

        //Collections.sort(courses);

        courses.forEach(System.out::println);

    }

    private static List<Course> getCourses() {
        List<Course> courseList = new ArrayList<>();
        Course course1 = Course.builder()
                .courseId(1001)
                .courseName("Full stack Java")
                .coursePrice(37)
                .courseDurationInMonths(6)
                .courseContent("Core Java, Adv Java, Frameworks, UI")
                .build();
        Course course2 = Course.builder()
                .courseId(101)
                .courseName("Full stack Python")
                .coursePrice(37)
                .courseDurationInMonths(6)
                .courseContent("Core Python, Adv Python, Frameworks, UI")
                .build();

        Course course3 = Course.builder()
                .courseId(2)
                .courseName("Data Science")
                .coursePrice(45)
                .courseDurationInMonths(3)
                .courseContent("Core Python, Data Science, Machine Learning, SQL")
                .build();
        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
        return courseList;
    }
}
