package designPatterns.cor;

public class CEO implements ExpenseHandler{
    private static final double MAX_APPROVAL = 10000;

    @Override
    public void handleRequest(Expense expense) {
        if(expense.getAmount() <= MAX_APPROVAL){
            System.out.println("CEO approves expense of $"+expense.getAmount());
        } else {
            System.out.println("Expense request of $"+expense.getAmount()+" exceeds approval");
        }
    }
}
