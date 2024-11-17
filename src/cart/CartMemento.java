package cart;

import model.Product;

import java.util.List;

public class CartMemento {
    private final List<Product> items;
    private final double totalAmount;

    public CartMemento(List<Product> items, double totalAmount) {
        this.items = items;
        this.totalAmount = totalAmount;
    }

    public List<Product> getItems() {
        return items;
    }

    public double getTotalAmount() {
        return totalAmount;
    }
}

