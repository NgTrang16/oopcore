package assignment.bai5;


public class TestShape {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle(5.4F,4.5F);
        shape1.showChuVi();
        System.out.println(shape1.chuvi());
        shape1.showDienTich();
        System.out.println(shape1.dientich());
        shape1.dientich();


        Rectangle rectangle = new Rectangle(5.3F,4.5F);
        rectangle.showChuVi();
        System.out.println(rectangle.chuvi());
        rectangle.showDienTich();
        System.out.println(rectangle.dientich());

    }


}
