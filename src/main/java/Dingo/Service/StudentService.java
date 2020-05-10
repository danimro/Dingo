package Dingo.Service;

import Dingo.Dao.StudentDao;
import Dingo.Entity.Job;
import Dingo.Entity.Student;
import Dingo.Entity.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Collection;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    //for debug
    public Collection<Student> getAllStudents() {
        return studentDao.getAllStudents();
    }

    public Student getStudentByID(int id) {
        return this.studentDao.getStudentByID(id);
    }

    public List<Teacher> getTeachersOfStudent(int id) {
        return this.studentDao.getTeachersOfStudent(id);
    }

    public List<Job> getJobsOfStudent(int id) {
        return this.studentDao.getJobsOfStudent(id);
    }

    public String getStudentName(int id) {
        return this.studentDao.getStudentName(id);
    }

    public void addStudent(int id, String name){
        Student toAdd = new Student(id, name);
        this.studentDao.addStudent(toAdd);
    }

    public void addJobToStudent( int id, Job job){
        this.studentDao.addTeacherToStudent(id, job.getTeacher());
        this.studentDao.addJobToStudent(id, job);
    }



}
