package com.encapsulation;

public class Program {
    public static void main(String[] args) {
        School school1 = new School();
        school1.showData();
        school1.address = "bac dong quan";
        school1.showData();
        school1.setAddress("hooo");
        school1.showData();
        school1.setNumTeacher(44);
        school1.showData();
    }
}
