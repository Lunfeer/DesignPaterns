package model;

public abstract class ProductFactory {
    public abstract Product createProduct(String name, double price, int quantity);
}
