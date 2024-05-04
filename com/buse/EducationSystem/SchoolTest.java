package com.buse.EducationSystem;

import java.util.ArrayList;
import java.util.List;

public class SchoolTest {
    public static void main(String[] args) {
        School school = new School();

        school.setSchoolId(1001);
        school.setSchoolName("FG Institute");

        //first test
        System.out.println("School ID: " + school.getSchoolId());
        System.out.println("School Name: " + school.getSchoolName());

        //second test
        School school2 = new School(1002, "Nasuh's School");
    
        System.out.printf("School ID: %d\nSchool Name: %s\n", school2.getSchoolId(), school2.getSchoolName());

        //third test add students to school
        List<Student> studentList = new ArrayList<>();
        school.setStudentList(studentList);

        //introduce student to school
        Student student0 = new Student(101,"Neset", 3.5);
        student0.setSchool(school);
        school.getStudentList().add(student0);

        Student student1 = new Student(102,"Buse", 3.9);
        student1.setSchool(school);
        school.getStudentList().add(student1);

        Student student2 = new Student(103,"Nasuh", 3.7);
        student2.setSchool(school);
        school.getStudentList().add(student2);

        for(Student student : school.getStudentList()){
            System.out.println("Student ID: " + student.getStudentId()
                            + "\nStudent Name: " + student.getStudentName()
                            + "\nAverage Grade: " + student.getAverageGrade());
        }
        for(Student student : school.getStudentList()){
            System.out.println("School No: " + school.getSchoolId());
            System.out.println(student); //toString() method is called
        }
    }
    
}
