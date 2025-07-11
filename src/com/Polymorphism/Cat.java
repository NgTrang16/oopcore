package com.Polymorphism;

public class Cat extends Animal {
    @Override
    public void showDate() {
        System.out.println("data cat");
    }

    @Override
    public float getPrice() {
        return super.getPrice();
    }

    public void showDate1() {
        System.out.println("data cat333");
    }
}
