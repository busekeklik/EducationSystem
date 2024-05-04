package com.buse.EducationSystem;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;


public class StudentLoader extends EntityFiler{
    //first develop loader
    public StudentLoader(String filePath) {
        super(filePath);
    }

    //load the list of students 
    public List<Student> load() throws IOException{
        List<Student> studentList = new ArrayList<Student>();
        FileReader fr = new FileReader(filePath);
        BufferedReader br = new BufferedReader(fr);
        //reading line by line
        String line;
        while((line = br.readLine()) != null){
            Student student = parse(line);
            studentList.add(student);
        }
        br.close();
        return studentList;
    }

    //parse the line and create a student object
    private Student parse(String line){
        StringTokenizer tokenizer = new StringTokenizer(line, fieldDelimiter);
        long studentId = Long.parseLong(tokenizer.nextToken());
        String studentName = tokenizer.nextToken();
        double averageGrade = Double.parseDouble(tokenizer.nextToken());
        return new Student(studentId, studentName, averageGrade);
    }
}
