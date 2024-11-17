package inventory;

import model.Product;

public class Inventory extends Subject {
    private Product product;

    public Inventory(Product product) {
        this.product = product;
    }

    public void updateInventory(int quantity) {
        setQuantity(quantity);
    }

    public Product getProduct() {
        return product;
    }
}
