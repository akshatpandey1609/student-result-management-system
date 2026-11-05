package com.bytecode.main.db;
import com.bytecode.main.bo.StudentBO;

public class DB {

    public String getStudentResultString(StudentBO obj) {
        StringBuilder sb = new StringBuilder();
        sb.append("========== STUDENT RESULT ==========\n");
        sb.append("Roll No : ").append(obj.getRno()).append("\n");
        sb.append("Name    : ").append(obj.getName()).append("\n");
        sb.append("Age     : ").append(obj.getAge()).append("\n");
        sb.append("Total   : ").append(obj.getTotal()).append("\n");
        sb.append("Average : ").append(obj.getAvg()).append("\n");
        sb.append("Grade   : ").append(obj.getGrade()).append("\n");
        sb.append("Result  : ").append(obj.getResult()).append("\n");
        sb.append("====================================");
        return sb.toString();
    }

    public void displayStudentResult(StudentBO obj) {
        System.out.println("\n" + getStudentResultString(obj));
    }
}
