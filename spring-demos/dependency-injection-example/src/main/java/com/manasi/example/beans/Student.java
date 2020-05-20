 package com.manasi.example.beans;

public class Student {

    public Student(String studentName) {
        this.studentName = studentName;
    }

    public Student(int id, String studentName) {
        this.id = id;
        this.studentName = studentName;
        System.out.println("in constructor");
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
        System.out.println("In student method");
    }

    public void setId(int id) {
        this.id = id;
        System.out.println("In id method");
    }

    private int id;
    private String studentName;

    public void displayStudentInfo() {
        System.out.println("Student name is " + studentName + "\n ID is" + id);
    }

}
