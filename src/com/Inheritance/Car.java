package com.Inheritance;

public class Car extends Vehicle{
    public int numSeat;

    public int getNumSeat() {
        return numSeat;
    }

    public void setNumSeat(int numSeat) {
        this.numSeat = numSeat;
    }

    @Override
    public String toString() {
        return "Car{" +
                "width=" + width +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", numSeat=" + numSeat +
                '}';
    }
}
