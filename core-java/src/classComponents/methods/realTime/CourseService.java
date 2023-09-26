package classComponents.methods.realTime;

public class CourseService {
    CourseDao courseDao = new CourseDao();

    void addCourse(Course course) {
        courseDao.addCourse(course);
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
