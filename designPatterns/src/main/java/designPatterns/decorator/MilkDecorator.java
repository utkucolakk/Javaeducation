package designPatterns.decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    @Override
    public double cost(){
        return super.cost() + 1.0; // Additional cost for milk
    }

    @Override
    public String description(){
        return super.description() + "with Milk";
    }
}
