// Base abstract class
public abstract class Product {
    private String id;
    private String name;
    private double price;
    
    public Product(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    
    // Getters and setters
    public String getId() { return id; }
    public String getName() { return name; }
    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }
    
    // Abstract method to be implemented by subclasses
    public abstract String getProductDetails();
    
    // Method that will be overridden (for polymorphism)
    public double calculateTax() {
        return price * 0.1; // Default 10% tax
    }
    
    // Overloaded method (for polymorphism)
    public void updatePrice(double newPrice) {
        this.price = newPrice;
    }
    
    public void updatePrice(double newPrice, double discountPercent) {
        this.price = newPrice * (1 - discountPercent/100);
    }
}