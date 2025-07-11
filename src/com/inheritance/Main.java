package com.inheritance;

public class Main {
    public static void main(String[] args) {
    Car car1 = new Car();
    car1.numSeat = 2;
    car1.id = 1;
    car1.name = "xe dap";
    System.out.println("car");
    System.out.println(car1);
    Truck truck = new Truck();
    truck.id = 2;
    truck.name = "xe tai";
    truck.setWeight(2000.1F);
    truck.weight=3.5F;
    System.out.println("truck");
    System.out.println(truck);


    }
}
