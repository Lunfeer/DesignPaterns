package payment;

public class PayPalPayment extends PaymentProcessor {
    private String email;
    private String password;

    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    @Override
    protected boolean validatePayment() {
        // Simuler la validation du compte PayPal
        if (!email.isEmpty() && !password.isEmpty()) {
            System.out.println("PayPal account validation successful.");
            return true;
        }
        System.out.println("Invalid PayPal account details.");
        return false;
    }

    @Override
    protected boolean executePayment(double amount) {
        // Simuler le traitement du paiement via PayPal
        System.out.println("Processing PayPal payment of $" + amount);
        return true;
    }
}

