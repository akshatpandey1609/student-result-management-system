package com.bytecode.main;

import java.util.Scanner;

import com.bytecode.main.entity.Student;
import com.bytecode.main.service.StudentService;
import com.bytecode.main.service.impl.StudentServiceImpl;
import com.bytecode.main.bo.StudentBO;
import com.bytecode.main.db.DB;

public class MainApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll No: ");
        int rno = sc.nextInt();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Marks 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Marks 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Marks 3: ");
        int m3 = sc.nextInt();

        System.out.print("Enter Marks 4: ");
        int m4 = sc.nextInt();

        System.out.print("Enter Marks 5: ");
        int m5 = sc.nextInt();

        // Student object creation
        Student student = new Student(
                name, rno, age, m1, m2, m3, m4, m5
        );

        // Service object
        StudentService service = new StudentServiceImpl();

        // Calculate result
        StudentBO bo = service.calculateResult(student);

        // Display result
        DB db = new DB();
        db.displayStudentResult(bo);

        sc.close();
    }
}