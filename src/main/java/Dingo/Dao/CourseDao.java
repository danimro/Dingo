package Dingo.Dao;

import Dingo.Entity.Course;


import java.util.Collection;
import java.util.Map;

public class CourseDao {

    private static Map<Integer, Course> courses;

    public Collection<Course> getAllCourses(){
        return this.courses.values();
    }

    public Course getCourseByID(int id){
        return this.courses.get(id);
    }

}
