package Backend;

import java.util.Random;

public class PremiumUser extends Customer {

    private static final Random RNG = new Random();

    public PremiumUser(String username, String password, String fullName, String email) {
        super(username, password, fullName, email);
        this.role = Role.PREMIUM;
    }

    @Override
    public double calculateTotal() {
        double total = super.calculateTotal();

        // Discount between 20% and 50%
        double discountPercent = 20.0 + RNG.nextDouble() * 30.0;

        // Use the Discount helper class
        double discountedTotal = Discount.applyDiscount(total, discountPercent);

        return discountedTotal;  // Already rounded in helper
    }
}
