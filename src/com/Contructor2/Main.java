package com.Contructor2;

public class Main {
    // constructor: ham khoi tao, tao obj tu class
    //chay ngay khi tao doi tuong
    public static void main(String[] args) {
    School2 school2 = new School2();
    school2.setId(1);
    school2.setSchoolName("bdq1");

    System.out.println(school2);
    School2 school3 = new School2(2, "bdq2");
        System.out.println(school3);
    }

}
