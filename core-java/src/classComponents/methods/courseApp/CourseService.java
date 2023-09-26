package classComponents.methods.courseApp;

public class CourseService {
    CourseDao courseDao = new CourseDao();

    void addCourse(Course course) {
        courseDao.addCourse();
    }

    void deleteCourse() {
        courseDao.deleteCourse();
    }

    void updateCourse() {
        courseDao.updateCourse();
    }

    void getCourse() {
        courseDao.getCourse();
    }
}
