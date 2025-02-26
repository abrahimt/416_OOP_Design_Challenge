// Helper class for stamp coupling
public class DiscountStrategy {
    private double defaultDiscount;
    
    public DiscountStrategy(double defaultDiscount) {
        this.defaultDiscount = defaultDiscount;
    }
    
    public double getDiscountPercentage(Product product) {
        if (product instanceof Electronics && ((Electronics)product).isRefurbished()) {
            return 15.0; // 15% discount for refurbished electronics
        }
        return defaultDiscount;
    }
}