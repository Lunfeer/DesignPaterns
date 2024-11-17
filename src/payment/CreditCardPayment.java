package payment;

public class CreditCardPayment extends PaymentProcessor {
    private String cardNumber;
    private String cardHolderName;
    private String expirationDate;
    private String cvv;

    public CreditCardPayment(String cardNumber, String cardHolderName, String expirationDate, String cvv) {
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.expirationDate = expirationDate;
        this.cvv = cvv;
    }

    @Override
    protected boolean validatePayment() {
        // Simuler la validation de la carte de crédit
        if (cardNumber.length() == 16 && cvv.length() == 3) {
            System.out.println("Credit card validation successful.");
            return true;
        }
        System.out.println("Invalid credit card details.");
        return false;
    }

    @Override
    protected boolean executePayment(double amount) {
        // Simuler le traitement du paiement par carte de crédit
        System.out.println("Processing credit card payment of $" + amount);
        return true;
    }
}
