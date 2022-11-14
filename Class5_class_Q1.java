public class Class5_class_Q1 {
    public static void main(String[] args) {
        Book book1 = new Book("Harry Potter", "JK Rowling", 1000, "red");
        // Book book2 = new Book("AJ");
        Book book3 = new Book();
        book1.setRating(10);
        System.out.println(book3);
        ;
    }
}

class Book {
    String name;
    String author;
    String color;
    int rating;
    int numOfPages;
    int currentPage;
    boolean isOpen;

    Book() {
        name = "";
        author = "";
        color = "black";
        rating = 0;
        numOfPages = 1;
        currentPage = 1;
        isOpen = false;
    }

    Book(String n) {
        name = n;
    }

    Book(String n, String a, int p, String c) {
        name = n;
        author = a;
        numOfPages = p;
        color = c;
        currentPage = 1;
        isOpen = false;
    }

    void setRating(int r) {
        if (r <= 5)
            rating = r;
    }

    void setCurrentPage(int p) {
        if (p <= numOfPages)
            currentPage = p;
    }

    String getName() {
        return name;
    }

    public String toString() {
        return String.format("Book[name=%s, author=%s, numOfPages=%d, color=%s]", name, author, numOfPages, color);
    }
}
