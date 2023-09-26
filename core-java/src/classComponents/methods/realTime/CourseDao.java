package classComponents.methods.realTime;

public class CourseDao {
    void addCourse(Course course) {
        System.out.println("Course Dao : addCourse" + course);
    }

    void deleteCourse() {
        System.out.println("Course Dao : deleteCourse");
    }

    void updateCourse() {
        System.out.println("Course Dao : updateCourse");
    }

    void getCourse() {
        System.out.println("Course Dao : getCourse");

    }
}
