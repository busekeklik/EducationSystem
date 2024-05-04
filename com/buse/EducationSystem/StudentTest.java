package com.buse.EducationSystem;

public class StudentTest {
    public static void main(String[] args) {
        Student student = new Student();

        student.setStudentId(801);
        student.setStudentName("Buse Keklik");
        student.setAverageGrade(3.5);

        //first test
        System.out.println("Student ID: " + student.getStudentId());
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Average Grade: " + student.getAverageGrade());

        //second test
        Student student2 = new Student(802, "Nasuh Akar", 3.9);
    
    System.out.printf("Student ID: %d\nStudent Name: %s\nAverage Grade: %.2f\n", student2.getStudentId(), student2.getStudentName(), student2.getAverageGrade());
    } 
}
