// First subclass that inherits from Product
public class Book extends Product {
    private String author;
    private String isbn;
    private int pages;
    
    public Book(String id, String name, double price, String author, String isbn, int pages) {
        super(id, name, price);
        this.author = author;
        this.isbn = isbn;
        this.pages = pages;
    }
    
    // Getters
    public String getAuthor() { return author; }
    public String getIsbn() { return isbn; }
    public int getPages() { return pages; }
    
    // Implementation of abstract method (inheritance)
    @Override
    public String getProductDetails() {
        return "Book: " + getName() + " by " + author + ", ISBN: " + isbn + ", Pages: " + pages;
    }
    
    // Method overriding (polymorphism)
    @Override
    public double calculateTax() {
        return getPrice() * 0.05; // Books have 5% tax
    }
}