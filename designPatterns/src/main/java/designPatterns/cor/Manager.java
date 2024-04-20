package designPatterns.cor;

public class Manager implements ExpenseHandler{

    private ExpenseHandler nextHandler;
    private static final double MAX_APPROVAL = 1000;

    @Override
    public void handleRequest(Expense expense) {
        if(expense.getAmount() <= MAX_APPROVAL){
            System.out.println("Manager approves expense of $"+expense.getAmount());
        } else if(nextHandler!=null){
            nextHandler.handleRequest(expense);
        }
    }

    public void setNextHandler(ExpenseHandler handler) {
        this.nextHandler=handler;
    }
}
