package model;

public class ClothingFactory extends ProductFactory {
    @Override
    public Product createProduct(String name, double price, int quantity) {
        return new Clothing(name, price, quantity);
    }
}
