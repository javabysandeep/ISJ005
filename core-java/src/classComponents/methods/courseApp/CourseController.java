package classComponents.methods.courseApp;

public class CourseController {
    CourseService courseService = new CourseService();

    void addCourse(Course course) {
        courseService.addCourse(course);
    }

    void deleteCourse() {
        courseService.deleteCourse();
    }

    void updateCourse() {
        courseService.updateCourse();
    }

    void getCourse() {
        courseService.getCourse();
    }
}
