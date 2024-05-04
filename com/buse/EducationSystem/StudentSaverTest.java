package com.buse.EducationSystem;

import java.util.List;
import java.io.IOException;
import java.util.ArrayList;

public class StudentSaverTest {
    public static void main(String[] args) throws IOException {
        String filePath ="/Users/busekeklik/Desktop/new project/com/buse/EducationSystem/StudentList.txt";

        StudentSaver studentSaver = new StudentSaver(filePath); //,append:true);

        studentSaver.setFieldDelimiter("|");

        List<Student> studentList = new ArrayList<Student>();

        Student student0 = new Student(101,"Neset", 3.5);
        studentList.add(student0);

        Student student1 = new Student(102,"Buse", 3.9);
        studentList.add(student1);

        Student student2 = new Student(103,"Nasuh", 3.7);
        studentList.add(student2);

        studentSaver.save(studentList);
    
    }  
}
