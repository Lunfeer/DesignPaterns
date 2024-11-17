package payment;

public abstract class PaymentProcessor {
    // Méthode template
    public final void processPayment(double amount) {
        if (validatePayment()) {
            if (executePayment(amount)) {
                confirmOrder();
            } else {
                System.out.println("Payment execution failed.");
            }
        } else {
            System.out.println("Payment validation failed.");
        }
    }

    // Méthodes à implémenter par les sous-classes
    protected abstract boolean validatePayment();
    protected abstract boolean executePayment(double amount);

    // Confirmation de commande (comportement générique)
    protected void confirmOrder() {
        System.out.println("Order confirmed. Payment successful!");
    }
}
