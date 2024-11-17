package model;

public class BooksFactory extends ProductFactory {
    @Override
    public Product createProduct(String name, double price, int quantity) {
        return new Books(name, price, quantity);
    }
}
