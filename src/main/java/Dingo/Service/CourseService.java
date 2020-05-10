package Dingo.Service;

import Dingo.Dao.CourseDao;
import Dingo.Entity.Course;

import java.util.Collection;

public class CourseService {
    private CourseDao courseDao;

    public Collection<Course> getAllStudents() {
        return courseDao.getAllCourses();
    }

    public Course getStudentByID(int id) {
        return this.courseDao.getCourseByID(id);
    }
}
