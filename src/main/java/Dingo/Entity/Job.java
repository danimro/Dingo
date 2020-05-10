package Dingo.Entity;

import java.util.Date;



public class Job {

    private Teacher teacher;
    private Student student;
    private Date date;
    private JobType jobType;

    public Job(Teacher teacher, Student student, Date date, JobType jobType) {
        this.teacher = teacher;
        this.student = student;
        this.date = date;
        this.jobType = jobType;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public JobType getJobType() {
        return jobType;
    }

    public void setJobType(JobType jobType) {
        this.jobType = jobType;
    }
}

//CATHUP is referring to general help with course matirial
enum JobType{
    HW, QUIZ, TEST, CATCHUP;
}