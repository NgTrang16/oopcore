package assignment.bai7;

public class Student {
    public String name;
    public String maSinhVien;
    public double gpa;


    public String getDetail(){
        return "Student{" +
                "name='" + name + '\'' +
                ", maSinhVien='" + maSinhVien + '\'' +
                ", gpa=" + gpa +
                '}';
    }

    public Student() {
    }

    public Student(String name, String maSinhVien, double gpa) {
        this.name = name;
        this.maSinhVien = maSinhVien;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(String maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
