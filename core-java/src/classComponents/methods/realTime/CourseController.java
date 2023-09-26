package classComponents.methods.realTime;

public class CourseController {
    CourseService courseService = new CourseService();

    void addCourse() {
       // courseService.addCourse();
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
