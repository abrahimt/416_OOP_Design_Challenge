// Second subclass that inherits from Product and implements Discountable
public class Electronics extends Product implements Discountable {
    private String manufacturer;
    private int warrantyPeriod; // in months
    private boolean refurbished;
    
    public Electronics(String id, String name, double price, String manufacturer, 
                      int warrantyPeriod, boolean refurbished) {
        super(id, name, price);
        this.manufacturer = manufacturer;
        this.warrantyPeriod = warrantyPeriod;
        this.refurbished = refurbished;
    }
    
    // Getters
    public String getManufacturer() { return manufacturer; }
    public int getWarrantyPeriod() { return warrantyPeriod; }
    public boolean isRefurbished() { return refurbished; }
    
    // Implementation of abstract method (inheritance)
    @Override
    public String getProductDetails() {
        return "Electronics: " + getName() + " by " + manufacturer + 
               ", Warranty: " + warrantyPeriod + " months, " + 
               (refurbished ? "Refurbished" : "New");
    }
    
    // Method overriding (polymorphism)
    @Override
    public double calculateTax() {
        return getPrice() * 0.15; // Electronics have 15% tax
    }
    
    // Implementation of interface methods
    @Override
    public double applyDiscount(double discountPercent) {
        double discountedPrice = getPrice() * (1 - discountPercent/100);
        setPrice(discountedPrice);
        return discountedPrice;
    }
    
    @Override
    public boolean isEligibleForDiscount() {
        // Only refurbished items are eligible for discount
        return refurbished;
    }
}