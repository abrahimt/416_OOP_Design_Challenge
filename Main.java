// Main class to demonstrate the implementation
public class Main {
    public static void main(String[] args) {
        // Create products
        Book book = new Book("B001", "The Great Gatsby", 12.99, "F. Scott Fitzgerald", 
                             "978-3-16-148410-0", 180);
        
        Electronics laptop = new Electronics("E001", "MacBook Pro", 1299.99, "Apple", 
                                           12, false);
        
        Electronics refurbPhone = new Electronics("E002", "iPhone 13", 699.99, "Apple", 
                                                6, true);
        
        // Create shopping cart
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(book);
        cart.addItem(laptop);
        cart.addItem(refurbPhone);
        
        // Display initial cart
        System.out.println("Initial Cart:");
        cart.displayCart();
        
        // Apply discounts using a discount strategy
        DiscountStrategy strategy = new DiscountStrategy(5.0);
        cart.applyDiscounts(strategy);
        
        // Display cart after discounts
        System.out.println("\nCart after discounts:");
        cart.displayCart();
        
        // Calculate total with data coupling
        double total = cart.calculateTotal(10.0, true);
        System.out.println("\nTotal (with shipping and tax): $" + total);
    }
}