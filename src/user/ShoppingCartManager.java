package user;

import cart.ShoppingCart;
import inventory.Inventory;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCartManager {
    private static ShoppingCartManager instance;
    private final Map<String, ShoppingCart> userCarts;
    private final Inventory inventory;

    private ShoppingCartManager(Inventory inventory) {
        userCarts = new HashMap<>();
        this.inventory = inventory;
    }

    // Obtenir l'instance unique
    public static synchronized ShoppingCartManager getInstance(Inventory inventory) {
        if (instance == null) {
            instance = new ShoppingCartManager(inventory);
        }
        return instance;
    }

    // Obtenir ou créer un panier pour l'utilisateur
    public ShoppingCart getShoppingCart(User user) {
        return userCarts.computeIfAbsent(user.getUsername(), k -> new ShoppingCart());
    }

    // Afficher tous les paniers actifs
    public void displayAllCarts() {
        System.out.println("All Active Shopping Carts:");
        userCarts.forEach((username, cart) -> {
            System.out.println("\nCart for user: " + username);
            cart.displayCart();
        });
    }
}
