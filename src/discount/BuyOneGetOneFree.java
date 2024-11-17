package discount;

import model.Product;
import java.util.List;
import java.util.stream.Collectors;

public class BuyOneGetOneFree implements DiscountStrategy {

    @Override
    public double applyDiscount(double totalAmount, List<Product> items) {
        double discount = 0;
        for (Product item : items) {
            if (item.getQuantity() >= 2) {
                // Appliquer une réduction pour chaque paire d'articles
                discount += (item.getPrice() * (item.getQuantity() / 2));
            }
        }
        return totalAmount - discount;
    }
}
