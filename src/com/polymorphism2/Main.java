package com.polymorphism2;

public class Main {
    //override: khoi tao lai
    //overload: nap chong
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.sound();
        Animal animal = new Animal();
        animal.sound();
        Animal animal1 = new Cat();
        animal1.sound();
    }
}
