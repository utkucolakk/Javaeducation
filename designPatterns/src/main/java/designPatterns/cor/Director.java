package designPatterns.cor;

public class Director implements ExpenseHandler{
    private ExpenseHandler nextHandler;
    private static final double MAX_APPROVAL = 5000;

    @Override
    public void handleRequest(Expense expense) {
        if(expense.getAmount() <= MAX_APPROVAL){
            System.out.println("Director approves expense of $"+expense.getAmount());
        } else if(nextHandler!=null) {
            nextHandler.handleRequest(expense);
        }
    }

    public void setNextHandler(ExpenseHandler handler) {
        this.nextHandler=handler;
    }
}
