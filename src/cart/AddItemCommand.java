package cart;

import model.Product;

public class AddItemCommand implements CartCommand {
    private final ShoppingCart cart;
    private final Product product;

    public AddItemCommand(ShoppingCart cart, Product product) {
        this.cart = cart;
        this.product = product;
    }

    @Override
    public void execute() {
        cart.addItem(product);
    }
}

