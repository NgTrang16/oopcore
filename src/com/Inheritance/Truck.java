package com.Inheritance;

public class Truck extends Vehicle{
    public float weight;

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "weight=" + weight +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", width=" + width +
                '}';
    }
}
