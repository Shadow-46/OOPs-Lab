class Payment {
    void processPayment() {
        System.out.println("Processing a generic payment...");
    }
}
class CreditCardPayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing payment using Credit Card...");
    }
}
class PayPalPayment extends Payment {
    @Override
    void processPayment() {
        System.out.println("Processing payment using PayPal...");
    }
}
public class Overriding1 {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment();
        payment1.processPayment();
        Payment payment2 = new PayPalPayment();
        payment2.processPayment();
    }
}
