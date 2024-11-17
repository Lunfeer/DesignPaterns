package inventory;
import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> observers;
    private int quantity;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers(String productName) {
        for (Observer observer : observers) {
            observer.update(productName, quantity);
        }
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        notifyObservers("Product"); // Remplacez "Product" par le nom du produit si nécessaire
    }

    public int getQuantity() {
        return quantity;
    }
}
