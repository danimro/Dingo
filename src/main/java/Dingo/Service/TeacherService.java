package Dingo.Service;

import Dingo.Dao.TeacherDao;
import Dingo.Entity.Course;
import Dingo.Entity.Teacher;

import java.util.Collection;
import java.util.List;

public class TeacherService {
    private TeacherDao teacherDao;

    public Collection<Teacher> getAllTeachers() {
        return teacherDao.getAllTeachers();
    }

    public Teacher getTeacherByID(int id) {
        return this.teacherDao.getTeacherByID(id);
    }

    public List<Course> getCoursesOfTeacher(int id){
        return this.teacherDao.getCoursesOfTeacher(id);
    }

    public void addCourse(int teacherID, int courseID){

    }
}
