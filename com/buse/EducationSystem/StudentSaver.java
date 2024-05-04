package com.buse.EducationSystem;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.io.BufferedWriter;


public class StudentSaver extends EntityFiler{

    private String newLine = "\r\n";
    
    public StudentSaver(String filePath) {
        super(filePath);
    }

    //first define a method to make formatted output
    private String format(Student student){
        StringBuilder builder = new StringBuilder();
        builder.append(student.getStudentId()).append(";"); //append student id
        builder.append(student.getStudentName()).append(";"); //append student name
        builder.append(student.getAverageGrade());
        return builder.toString();
    }

    public void save(List<Student> studentList) throws IOException{
        FileWriter fw = new FileWriter(filePath);
        //to boost performance, we can use BufferedWriter
        BufferedWriter bw = new BufferedWriter(fw);
        //how are we going to save students to disk?
        for(Student student: studentList){
            String line = format(student);
            bw.write(line+newLine);
        }
        bw.close();
    }


    public String getNewLine() {
        return newLine;
    }

    public void setNewLine(String newLine) {
        this.newLine = newLine;
    }

    
}
