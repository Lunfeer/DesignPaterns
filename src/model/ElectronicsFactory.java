package model;

public class ElectronicsFactory extends ProductFactory {
    @Override
    public Product createProduct(String name, double price, int quantity) {
        return new Electronics(name, price, quantity);
    }
}
