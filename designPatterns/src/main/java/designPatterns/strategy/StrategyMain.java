package designPatterns.strategy;

public class StrategyMain {

    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext();

        paymentContext.setPaymentContext(new CreditCardPayment("1234-5678-8684"));
        paymentContext.processPayment(1000);

        paymentContext.setPaymentContext(new PayPalPayment("test@strategy.com"));
        paymentContext.processPayment(4000);
    }
}
