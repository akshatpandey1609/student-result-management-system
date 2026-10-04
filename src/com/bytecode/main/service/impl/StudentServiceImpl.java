 package com.bytecode.main.service.impl;
  
import com.bytecode.main.bo.StudentBO;
import com.bytecode.main.entity.Student;
import com.bytecode.main.service.StudentService;
  
public class StudentServiceImpl implements StudentService {

    @Override
    public StudentBO calculateResult(Student obj) {

        int total = obj.getM1()
                   + obj.getM2()
                   + obj.getM3()
                   + obj.getM4()
                   + obj.getM5();

        double avg = total / 5.0;

        String grade;
        String result;

        if (obj.getM1() >= 33 &&
            obj.getM2() >= 33 &&
            obj.getM3() >= 33 &&
            obj.getM4() >= 33 &&
            obj.getM5() >= 33) {

            result = "PASS";

            if (avg >= 90)
                grade = "A+";
            else if (avg >= 80)
                grade = "A";
            else if (avg >= 70)
                grade = "B";
            else if (avg >= 60)
                grade = "C";
            else if (avg >= 50)
                grade = "D";
            else
                grade = "E";

        } else {
            result = "FAIL";
            grade = "F";
        }

        StudentBO bo = new StudentBO();

        bo.setRno(obj.getRno());
        bo.setName(obj.getName());
        bo.setAge(obj.getAge());
        bo.setTotal(total);
        bo.setAvg(avg);
        bo.setGrade(grade);
        bo.setResult(result);

        return bo;
    }
}
