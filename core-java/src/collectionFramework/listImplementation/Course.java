package collectionFramework.listImplementation;

import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
public class Course /*implements Comparable<Course>*/ {
    private int courseId;
    private String courseName;
    private int coursePrice;
    private int courseDurationInMonths;
    private String courseContent;
/*
    @Override
    public int compareTo(Course course) {
       // return this.courseId - course.courseId;
      //  return this.coursePrice - course.coursePrice;
       // return this.courseDurationInMonths - course.courseDurationInMonths;
        return this.courseName.compareTo(course.courseName);
    }*/
}
