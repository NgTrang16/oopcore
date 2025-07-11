package assignment.bai7;

public class test {
    public static void main(String[] args) {
        Student[] students = new Student[]{
                new Student("A", "123",3),
                new Student("B", "345",4),
                new Student("C", "567",5)
        };
        GraduateStudent[] graduateStudents = new GraduateStudent[]{
                new GraduateStudent("A1","detai1"),
                new GraduateStudent("A2","detai2"),
                new GraduateStudent("A3","detai3")
        };
        for(Student a:students){
            System.out.println(a.getDetail());
        }
        for(GraduateStudent a:graduateStudents){
            System.out.println(a.getDetail());
        }

    }
}
