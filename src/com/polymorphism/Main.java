package com.polymorphism;

public class Main {
    //override: khoi tao lai
    //overload: nap chong
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.showDate();
        cat.getInfor("meo vang");
        float results = cat.total(200, 200.4F);
        System.out.println(results);
    }
}
