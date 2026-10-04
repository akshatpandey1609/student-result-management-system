package com.bytecode.main.db;
import com.bytecode.main.bo.StudentBO;

public class DB {

    public void displayStudentResult(StudentBO obj) {

        System.out.println("\n========== STUDENT RESULT ==========");
        System.out.println("Roll No : " + obj.getRno());
        System.out.println("Name    : " + obj.getName());
        System.out.println("Age     : " + obj.getAge());
        System.out.println("Total   : " + obj.getTotal());
        System.out.println("Average : " + obj.getAvg());
        System.out.println("Grade   : " + obj.getGrade());
        System.out.println("Result  : " + obj.getResult());
        System.out.println("====================================");
    }
}