package com.buse.EducationSystem;

import java.util.Scanner;


public class RegistrationConsole {

    private static Scanner scanner = new Scanner(System.in);

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

    public static void main(String[] args) {
        printMenu();
        int choice = scanChoice();
    }
    
}
