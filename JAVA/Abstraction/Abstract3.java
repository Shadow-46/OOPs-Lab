abstract class Payment {
    abstract void pay();
}

class CreditCard extends Payment {
    @Override
    void pay() {
        System.out.println("Paying using Credit Card.");
    }
}

class PayPal extends Payment {
    @Override
    void pay() {
        System.out.println("Paying using PayPal.");
    }
}

public class Abstract3 {
    public static void main(String[] args) {
        Payment p1 = new CreditCard();
        p1.pay();

        Payment p2 = new PayPal();
        p2.pay();
    }
}
