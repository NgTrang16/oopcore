package com.Contructor;

public class Main {
    // constructor: ham khoi tao, tao obj tu class
    //chay ngay khi tao doi tuong
    public static void main(String[] args) {
        Student student1 = new Student();
        String schoolName = student1.getNameSchool();
        System.out.println("School name " + schoolName);
        student1.setNameSchool("bac dong quan");
        System.out.println(student1);

        Student student2 = new Student(1,"bdq1");

        System.out.println(student2);
    }
}
