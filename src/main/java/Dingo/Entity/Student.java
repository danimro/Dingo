package Dingo.Entity;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private int id;
    private String password;
    private String name;
    private List<Job> jobs;
    private List<Teacher> teachers;


    public int getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void addJob(Job toAdd) {
        this.jobs.add(toAdd);
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher toAdd) {
        this.teachers.add(toAdd);
    }

    public void setName(String name) {
        this.name = name;
    }

    public Student(int id, String password, String name) {
        this.id = id;
        this.password = password;
        this.name = name;
        this.jobs = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }
}
