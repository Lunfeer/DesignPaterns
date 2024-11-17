package discount;

import model.Product;
import java.util.List;

public interface DiscountStrategy {
    double applyDiscount(double totalAmount, List<Product> items);
}
