package com.buse.EducationSystem;

import java.util.List;
import java.util.ArrayList;

public class School {
    private long schoolId;
    private String schoolName;

    //relationship between School and Student is one-to-many
    private List<Student> studentList = new ArrayList<Student>();

    public School(long schoolId, String schoolName) {
        this.schoolId = schoolId;
        this.schoolName = schoolName;
    }

    public School() {
    }

    public long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(long schoolId) {
        this.schoolId = schoolId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public List<Student> getStudentList() {
        return studentList;
    }
    
    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
