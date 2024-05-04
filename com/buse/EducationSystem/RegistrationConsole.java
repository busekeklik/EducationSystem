package com.buse.EducationSystem;

import java.util.InputMismatchException;
import java.util.Scanner;


public class RegistrationConsole {

    private static Scanner scanner = new Scanner(System.in);

    //listing
    private static School school = new School(1, "School of Java");

    //saving
    private static StudentSaver studentSaver = new StudentSaver("/Users/busekeklik/Desktop/new project/com/buse/EducationSystem/StudentList.txt");

    //loading
    private static StudentLoader studentLoader = new StudentLoader("/Users/busekeklik/Desktop/new project/com/buse/EducationSystem/StudentList.txt");

    private static void printMenu() {
        System.out.println("The Menu");
        System.out.println("1. List Students");
        System.out.println("2. Add Student");
        System.out.println("3. Update Student");
        System.out.println("4. Delete Student");
        System.out.println("5.Select Student");
        System.out.println("6.Load Students (from disk)");
        System.out.println("7.Save Students (to disk)");
        System.out.println("0. Exit");
        System.out.println("Enter your choice(0 to quit): ");
    }

    private static int scanChoice() {
        int choice = scanner.nextInt();
        return choice;
    }

    private static void handleCommand(int choice) {
        System.out.println("The command to executed is: " + choice);
        switch (choice) {
            case 1: listStudents(); break;
            case 2: addStudent(); break;
            case 3: updateStudent(); break;
            case 4: deleteStudent(); break;
            case 5: selectStudent(); break;
            case 6: loadStudents(); break;
            case 7: saveStudents(); break;
            case 0: exitConsole(); break;
            default: System.out.println("Invalid choice"); break;
        }
    }

    private static void listStudents() {
        System.out.println("Listing students");
        for (Student student : school.getStudentList()) {
            System.out.println(student.getStudentId()
                     + student.getStudentName()
                    + student.getAverageGrade());
        }
        System.out.println("The number of students: " + school.getStudentList().size());
    }

    private static void addStudent() {
        System.out.println("Adding student");
        System.out.println("Enter student ID: ");
        long studentId = scanner.nextLong();
        System.out.println("Enter student name: ");
        String studentName = scanner.next();
        System.out.println("Enter student average grade: ");
        double averageGrade = scanner.nextDouble();
        Student student = new Student(studentId, studentName, averageGrade);
        school.getStudentList().add(student);
        System.out.println("Student added successfully");
        //IMPROVEMENT
        student.setSchool(school);
        System.out.println("The student has been added to the list successfully");

    }

    private static void updateStudent() {
        System.out.println("updating...");
        System.out.println("Student Id to update: ");
        long studentId = scanner.nextLong();
        Student student = school.find(studentId);
        if(student != null) {
            System.out.println("Enter new student name: ");
            String studentName = scanner.next();
            student.setStudentName(studentName);
            
            System.out.println("Enter new student average grade: ");
            double averageGrade = scanner.nextDouble();
            student.setAverageGrade(averageGrade);
        } else {
            System.out.println("There is no student with student Id: " + studentId);
        }
        System.out.println("Student updated successfully");
        System.out.println("Be sure to save updated information to disk!");
    }

    private static void deleteStudent() {
        System.out.println("deleting...");
        System.out.println("Student Id(to delete): ");
        long studentId = scanner.nextLong();
        Student student = school.find(studentId);
        if(student!=null){
            school.getStudentList().remove(student);
        } else {
            System.out.println("There is no student with student Id: " + studentId);
        }
        System.out.println("Student deleted successfully");
        
    }

    private static void selectStudent() {
        System.out.println("Selecting student");
        System.out.println("Enter student ID: ");
        long studentId = scanner.nextLong();
        Student student = school.find(studentId);
        if(student != null) {
            System.out.println("Student no: " + student.getStudentId());
            System.out.println("Student name: " + student.getStudentName());
            System.out.println("Student average grade: " + student.getAverageGrade());
        } else {
            System.out.println("There is no student with student Id: " + studentId);
        }
    }

    private static void loadStudents() {
        System.out.println("Loading students");
        try {
            school.setStudentList(studentLoader.load());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Students loaded successfully");
    }

    private static void saveStudents() {
        System.out.println("saving...");
        try {
            studentSaver.save(school.getStudentList());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Students saved successfully");
    }

    private static void exitConsole() {
        System.out.println("Exiting...");
        System.exit(0); // leaving without error
    }


    public static void main(String[] args) {
        while (true) {
            
            try {
                printMenu();
                int choice = scanChoice();
                handleCommand(choice);
            } catch (InputMismatchException e) {
                System.out.println("There was a mismatch");
                scanner.nextLine(); // clear the buffer
            }
        }
    }
}

