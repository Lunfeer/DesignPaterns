package cart;

import model.Product;

public class RemoveItemCommand implements CartCommand {
    private final ShoppingCart cart;
    private final Product product;

    public RemoveItemCommand(ShoppingCart cart, Product product) {
        this.cart = cart;
        this.product = product;
    }

    @Override
    public void execute() {
        cart.removeItem(product);
    }
}

