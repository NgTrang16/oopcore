package com.Polymorphism;

public class Animal {
    public String name;
    public float price;
public void showDate(){
    System.out.println("data run");
}
public void getInfor(String name){
    System.out.println("name : " + name);
}

    public float total(float price1, float price2, float price3){
        return price1 + price2 +price3;
    }
    public float total(float price1, float price2){
        return price1 + price2;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public Animal() {
    }

    public Animal(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
