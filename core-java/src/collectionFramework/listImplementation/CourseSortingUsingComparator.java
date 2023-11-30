package collectionFramework.listImplementation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CourseSortingUsingComparator {
    public static void main(String[] args) {
        List<Course> courses = getCourses();

        //1. using traditional
        /*class CourseComparator implements Comparator<Course> {
            @Override
            public int compare(Course course1, Course course2) {
                return course1.getCourseId() - course2.getCourseId();
            }
        };
        Comparator comparator = new CourseComparator();*/

        //2. using anonymous class
       /* Comparator<Course> comparator = new Comparator<Course>() {
            @Override
            public int compare(Course course1, Course course2) {
                return course1.getCourseId() - course2.getCourseId();
            }
        };*/

        //3. using lambda expression
        //Comparator<Course> comparator = (course1, course2) -> course1.getCourseId() - course2.getCourseId();


        //4. using method reference
        Comparator<Course> comparator = Comparator.comparingInt(Course::getCourseId);

        Collections.sort(courses, comparator);

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
