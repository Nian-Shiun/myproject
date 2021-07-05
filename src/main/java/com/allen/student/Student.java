package com.allen.student;

public class Student {
    String id;
    String name;
    int english;
    int math;

    //alt+insert->constructor,選擇name,english,math
    public Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }

    /*public com.allen.Student(String name, int english, int math) {
        this.name = name;
        this.english = english;
        this.math = math;
    }*/

    public void print() {
        System.out.println(name + "\t" + english + "\t" + math +
                "\t" + (english+math)/2);
    }
}
