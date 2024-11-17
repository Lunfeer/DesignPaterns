package discount;

import model.Product;
import java.util.List;

public class PercentageDiscount implements DiscountStrategy {
    private final double percentage;

    public PercentageDiscount(double percentage) {
        this.percentage = percentage;
    }

    @Override
    public double applyDiscount(double totalAmount, List<Product> items) {
        return totalAmount - (totalAmount * (percentage / 100));
    }
}
