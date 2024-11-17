package discount;

import model.Product;

import java.util.List;

public class HolidayPromotion implements DiscountStrategy {
    private final double discountAmount;

    public HolidayPromotion(double discountAmount) {
        this.discountAmount = discountAmount;
    }

    @Override
    public double applyDiscount(double totalAmount, List<Product> items) {
        return Math.max(0, totalAmount - discountAmount);
    }
}
