package assignment.bai4;

public class testBook {
    public static void main(String[] args) {
        Book book = new Book("sach do", "author1",200.4F);
        System.out.println(book);

        String title = book.getTitle();
        System.out.println("ten sach : " + title);
        String nameAuthor = book.getNameAuthor();
        System.out.println("ten tac gia : " + nameAuthor);
        Float price = book.getPrice();
        System.out.println("gia tien : " + price);

        book.setPrice(300.4F);
        System.out.println(book);

    }
}
