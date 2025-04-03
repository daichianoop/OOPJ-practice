// Book class definition
class Book {
    private String title;
    private String author;
    private double price;

    // Default constructor
    public Book() {
        this("Unknown", "Unknown", 0.0);
    }

    // Constructor with title and author
    public Book(String title, String author) {
        this(title, author, 0.0);
    }

    // Constructor with title, author, and price
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price);
    }
}

// Main class
public class BookTest {
    public static void main(String[] args) {
        // Creating objects using different constructors
        Book book1 = new Book();
        Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
        Book book3 = new Book("To Kill a Mockingbird", "Harper Lee", 15.99);

        // Displaying book details
        book1.displayBookDetails();
        book2.displayBookDetails();
        book3.displayBookDetails();
    }
}