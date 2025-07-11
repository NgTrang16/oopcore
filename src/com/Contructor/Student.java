package com.Contructor;

public class Student {
    private String nameSchool;
//no parameter
    public String getNameSchool() {
        return nameSchool;
    }
//parameter

    public Student(int id, String nameSchool) {
        System.out.println(id);
        this.nameSchool = nameSchool;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSchool='" + nameSchool + '\'' +
                '}';
    }

    public void setNameSchool(String nameSchool) {
        this.nameSchool = nameSchool;
    }

    public Student() {
        System.out.println("Run in constructor no parameter");
    }

    public Student(String nameSchool) {
        this.nameSchool = nameSchool;
    }
}
