package designPatterns.strategy;

public class PaymentContext {
    private PaymentStrategy paymentStrategy;

    public void setPaymentContext(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void processPayment(int amount){
        this.paymentStrategy.pay(amount);
    }
}
