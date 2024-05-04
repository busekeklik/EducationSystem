package com.buse.EducationSystem;

import java.io.IOException;
import java.util.List;


public class StudentLoaderTest {
    public static void main(String[] args) throws IOException{
        

        String filePath = "/Users/busekeklik/Desktop/new project/com/buse/EducationSystem/StudentList.txt";

        StudentLoader studentLoader = new StudentLoader(filePath);
        
        studentLoader.setFieldDelimiter("|");
        
        List<Student> studentList = studentLoader.load();

        for(Student student: studentList){
            System.out.println(student.getStudentId()
                        + " " + student.getStudentName()
                        + " " + student.getAverageGrade());
        }
    }
}
