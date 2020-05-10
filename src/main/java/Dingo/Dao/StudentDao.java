package Dingo.Dao;

import Dingo.Entity.Job;
import Dingo.Entity.Student;
import Dingo.Entity.Teacher;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class StudentDao {
    private static Map<Integer, Student> students;

//    static {
//        students = new HashMap<Integer, Student>(){
//            {
//                put(1, new Student(1,"Nissim"));
//                put(2, new Student(2,"Tomer"));
//            }
//        };
//    }

    public Collection<Student> getAllStudents(){
        return this.students.values();
    }

    public Student getStudentByID(int id){
        return this.students.get(id);
    }

    public List<Teacher> getTeachersOfStudent(int id){
        return this.students.get(id).getTeachers();
    }

    public List<Job> getJobsOfStudent(int id){
        return this.students.get(id).getJobs();
    }
    public String getStudentName(int id){
        return this.students.get(id).getName();
    }

    public void addStudent(Student toAdd){
        this.students.put(toAdd.getId(), toAdd);
    }

    public void addJobToStudent(int id, Job job){
        this.students.get(id).getJobs().add(job);
    }

    public void addTeacherToStudent(int id, Teacher teacher){
        this.students.get(id).getTeachers().add(teacher);
    }

}
