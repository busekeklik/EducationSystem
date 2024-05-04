package com.buse.EducationSystem;

public class Student {
    private long studentId;
    private String studentName;
    private double averageGrade;

    //relationship between School and Student is one-to-many
    private School school;

    public Student(long studentId, String studentName, double averageGrade) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.averageGrade = averageGrade;
    }

    public Student() {
    }

    public long getStudentId() {
        return studentId;
    }

    public void setStudentId(long studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }
}