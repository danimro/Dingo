package Dingo.Entity;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    private int id;
    private String name;
    private List<Course> courses;
    private List<Job> jobs;
    private List<Student> students;


    public int getId() {
        return id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public List<Course> getCourses() {
        return courses;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Teacher(int id, String name, List<Course> courses) {
        this.id = id;
        this.name = name;
        this.jobs = new ArrayList<>();
        this.students = new ArrayList<>();
        this.courses = courses;

    }
}
