package model;

public class Electronics implements Product {
    private String name;
    private double price;
    private int quantity;

    public Electronics(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public int getQuantity() {
        return quantity;
    }

    @Override
    public void displayInfo() {
        System.out.println("Electronics: " + name + " | Price: $" + price + " | Quantity: " + quantity);
    }
}

