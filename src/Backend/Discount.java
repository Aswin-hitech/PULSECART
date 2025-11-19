package Backend;

public class Discount {

    private Discount() {}  // Private constructor

    public static double applyDiscount(double total, double percent) {
        double discounted = total * (1 - percent / 100);
        return Math.round(discounted * 100.0) / 100.0; // Round to 2 decimals
    }
}
