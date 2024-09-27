// Interface Stripe
interface StripePayment {
    void pay(int amount);
}

// ImplementaÃ§Ã£o Stripe
class StripePaymentImpl implements StripePayment {
    public void pay(int amount) {
        System.out.println("Pagamento de $" + amount + " via Stripe processado.");
    }
}

// Classe PayPal com uma interface diferente
class PaypalPayment {
    public void sendPayment(int amount) {
        System.out.println("Pagamento de $" + amount + " via PayPal processado.");
    }
}

// Adapter que adapta PayPal para a interface Stripe
class PaypalAdapter implements StripePayment {
    private PaypalPayment paypalPayment;

    public PaypalAdapter(PaypalPayment paypalPayment) {
        this.paypalPayment = paypalPayment;
    }

    public void pay(int amount) {
        paypalPayment.sendPayment(amount);
    }
}

// Classe principal de execuÃ§Ã£o
public class Paypaladapter {
    public static void main(String[] args) {
        StripePayment stripePayment = new StripePaymentImpl();
        PaypalPayment paypal = new PaypalPayment();
        StripePayment paypalAdapter = new PaypalAdapter(paypal);

        processPayment(stripePayment, 100);  // Pagamento via Stripe
        processPayment(paypalAdapter, 200);  // Pagamento via PayPal adaptado
    }

    public static void processPayment(StripePayment paymentSystem, int amount) {
        paymentSystem.pay(amount);
    }
}
