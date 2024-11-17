package cart;

import model.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private final List<Product> items;
    private double totalAmount;
    private final List<CartMemento> savedStates; // Historique des sauvegardes

    public ShoppingCart() {
        this.items = new ArrayList<>();
        this.totalAmount = 0.0;
        this.savedStates = new ArrayList<>();
    }

    // Ajouter un produit au panier
    public void addItem(Product product) {
        items.add(product);
        totalAmount += product.getPrice() * product.getQuantity();
        System.out.println("Added to cart: " + product.getName());
    }

    public void removeItem(Product product) {
        if (items.remove(product)) {
            totalAmount -= product.getPrice() * product.getQuantity();
            System.out.println("Removed from cart: " + product.getName());
        } else {
            System.out.println("Product not found in cart: " + product.getName());
        }
    }

    // Afficher les articles dans le panier
    public void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Shopping cart is empty.");
        } else {
            System.out.println("Shopping Cart:");
            for (Product item : items) {
                item.displayInfo(); // Assurez-vous que la méthode displayInfo() est définie dans Product
            }
            System.out.println("Total Amount: $" + totalAmount);
        }
    }

    // Sauvegarder l'état actuel du panier
    public void saveCart() {
        savedStates.add(new CartMemento(new ArrayList<>(items), totalAmount));
        System.out.println("Cart state saved. Total saved versions: " + savedStates.size());
    }

    // Restaurer un état du panier précédemment sauvegardé
    public void restoreCart(int versionIndex) {
        if (versionIndex < 0 || versionIndex >= savedStates.size()) {
            System.out.println("Invalid version index.");
            return;
        }
        CartMemento memento = savedStates.get(versionIndex);
        items.clear();
        items.addAll(memento.getItems());
        totalAmount = memento.getTotalAmount();
        System.out.println("Restored cart to version " + (versionIndex + 1));
    }

    // Afficher les versions sauvegardées
    public void displaySavedVersions() {
        if (savedStates.isEmpty()) {
            System.out.println("No saved cart versions.");
            return;
        }
        System.out.println("Saved Cart Versions:");
        for (int i = 0; i < savedStates.size(); i++) {
            CartMemento memento = savedStates.get(i);
            System.out.println("Version " + (i + 1) + ": Total Amount = $" + memento.getTotalAmount());
        }
    }
}
