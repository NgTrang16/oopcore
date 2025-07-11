package com.contructor2;

public class School2 {
    private Integer id;
    private String schoolName;
    public School2(){
        System.out.println("f88");
    }

    public School2(Integer id, String schoolName) {
        this.id = id;
        this.schoolName = schoolName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    @Override
    public String toString() {
        return "School2{" +
                "id=" + id +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }
}
