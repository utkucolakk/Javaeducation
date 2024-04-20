package designPatterns.strategy;

public class CreditCardPayment implements PaymentStrategy{

    private String cardNumber;

    public CreditCardPayment(String creditCardNumber){
        this.cardNumber = creditCardNumber;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Paid "+amount+" using Credit card "+cardNumber);
    }
}
