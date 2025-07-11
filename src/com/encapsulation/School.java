package com.encapsulation;

public class School {
    public String address;
    //integer include null
    private Integer numTeacher;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumTeacher() {
        return numTeacher;
    }

    public void setNumTeacher(Integer numTeacher) {
        this.numTeacher = numTeacher;
    }

    public void showData() {
        System.out.println("run is showData");
        System.out.println("Address : " + address);
        System.out.println("NumTeacher : " + numTeacher);

        //this.address

    }

    ;
}
