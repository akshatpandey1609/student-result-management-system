package com.bytecode.main.entity;
public class Student {
    private String name;
    private int rno;
    private int age;
    private int m1;
    private int m2;
    private int m3;
    private int m4;
    private int m5;

    public Student() {
    }

    public Student(String name, int rno, int age,
                   int m1, int m2, int m3, int m4, int m5) {
        this.name = name;
        this.rno = rno;
        this.age = age;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
        this.m4 = m4;
        this.m5 = m5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRno() {
        return rno;
    }

    public void setRno(int rno) {
        this.rno = rno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getM1() {
        return m1;
    }

    public void setM1(int m1) {
        this.m1 = m1;
    }

    public int getM2() {
        return m2;
    }

    public void setM2(int m2) {
        this.m2 = m2;
    }

    public int getM3() {
        return m3;
    }

    public void setM3(int m3) {
        this.m3 = m3;
    }

    public int getM4() {
        return m4;
    }

    public void setM4(int m4) {
        this.m4 = m4;
    }

    public int getM5() {
        return m5;
    }

    public void setM5(int m5) {
        this.m5 = m5;
    }
}

