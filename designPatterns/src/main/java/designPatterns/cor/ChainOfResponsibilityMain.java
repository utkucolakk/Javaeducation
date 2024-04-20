package designPatterns.cor;

public class ChainOfResponsibilityMain {
    public static void main(String[] args) {
        ExpenseHandler manager = new Manager();
        ExpenseHandler director = new Director();
        ExpenseHandler ceo = new CEO();

        ((Manager) manager).setNextHandler(director);
        ((Director) director).setNextHandler(ceo);

        Expense expense1 = new Expense(800);
        Expense expense2 = new Expense(4500);
        Expense expense3 = new Expense(12000);

        manager.handleRequest(expense1);
        manager.handleRequest(expense2);
        manager.handleRequest(expense3);
    }

}
