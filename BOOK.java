public class BOOK {

    String title;
    String author;
    int price;

    BOOK(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    void displaybookDetails() {
        System.out.println("title:" + (title));
        System.out.println("author:" + (author));
        System.out.println("price:" + (price));
    }

    public static void main(String[] args) {
        BOOK book = new BOOK("positive", "ram", 450);
        book.displaybookDetails();
    }

}
