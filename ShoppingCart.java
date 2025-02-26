// Class demonstrating coupling
public class ShoppingCart {
    private Product[] items;
    private int itemCount;
    
    public ShoppingCart() {
        items = new Product[10]; // Cart can hold up to 10 items
        itemCount = 0;
    }
    
    public void addItem(Product product) {
        if (itemCount < items.length) {
            items[itemCount] = product;
            itemCount++;
        }
    }
    
    // Data coupling example - passing primitive types
    public double calculateTotal(double shippingCost, boolean applyTax) {
        double total = 0;
        for (int i = 0; i < itemCount; i++) {
            total += items[i].getPrice();
            if (applyTax) {
                total += items[i].calculateTax();
            }
        }
        return total + shippingCost;
    }
    
    // Stamp coupling example - passing an object
    public void applyDiscounts(DiscountStrategy strategy) {
        for (int i = 0; i < itemCount; i++) {
            if (items[i] instanceof Discountable) {
                Discountable discountable = (Discountable) items[i];
                if (discountable.isEligibleForDiscount()) {
                    double discountPercent = strategy.getDiscountPercentage(items[i]);
                    discountable.applyDiscount(discountPercent);
                }
            }
        }
    }
    
    public void displayCart() {
        System.out.println("Shopping Cart Contents:");
        for (int i = 0; i < itemCount; i++) {
            System.out.println(items[i].getProductDetails() + " - $" + items[i].getPrice());
        }
    }
}
