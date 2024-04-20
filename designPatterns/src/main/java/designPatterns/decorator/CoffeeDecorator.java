package designPatterns.decorator;

public class CoffeeDecorator implements Coffee{
    private Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee){
        this.decoratedCoffee = decoratedCoffee;
    }
    @Override
    public double cost() {
        return decoratedCoffee.cost();
    }

    @Override
    public String description() {
        return decoratedCoffee.description();
    }
}
