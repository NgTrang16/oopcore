package assignment.bai4;

public class Book {
    private String title;
    private String nameAuthor;
    private float price;

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", nameAuthor='" + nameAuthor + '\'' +
                ", price=" + price +
                '}';
    }

    public Book() {
    }

    public Book(String title, String nameAuthor, float price) {
        this.title = title;
        this.nameAuthor = nameAuthor;
        this.price = price;
    }

    // getter and setter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public float getPrice() {
        if(price<0){
            System.out.println("khong hop le");
            price =0;
        }else{
            System.out.println("gia tien : " + price);
        }
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

}
