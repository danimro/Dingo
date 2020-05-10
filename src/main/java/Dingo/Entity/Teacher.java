package Dingo.Entity;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private int id;
    private String password;
    private String name;
    private List<Course> courses;
    private List<Job> jobs;
    private List<Student> students;


    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudent(Student toAdd) {
        this.students.add(toAdd);
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void addCourse(Course toAdd) {
        this.courses.add(toAdd);
    }

    public void removeCourse(Course toRemove){
        this.courses.remove(toRemove);
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void addJob(Job toAdd) {
        this.jobs.add(toAdd);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher(int id,String password, String name, List<Course> courses) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.jobs = new ArrayList<>();
        this.students = new ArrayList<>();
        this.courses = courses;

    }
}
