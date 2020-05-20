package com.manasi.example.beans;

public class Student {
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String studentName;
    private int id;
    public void setMathCheat(MathCheat mathCheat) {
        this.mathCheat = mathCheat;
    }

    MathCheat mathCheat;

    public void cheating() {
        mathCheat.mathCheat();
    }
}
