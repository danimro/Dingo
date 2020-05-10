package Dingo.Dao;

import Dingo.Entity.Course;
import Dingo.Entity.Teacher;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class TeacherDao {

    private static Map<Integer, Teacher> teachers;

    public Collection<Teacher> getAllTeachers(){
        return this.teachers.values();
    }

    public Teacher getTeacherByID(int id){
        return this.teachers.get(id);
    }

    public List<Course> getCoursesOfTeacher(int id){
        return this.teachers.get(id).getCourses();
    }

    public void addCourse(int teacherID, int courseID){
        this.teachers.get(teacherID).
    }
}
