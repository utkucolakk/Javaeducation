package designPatterns.decorator;

public class DecoratorMain {

    public static void main(String[] args) {
        //Order Simple Coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost $"+coffee.cost()+" , Description: "+coffee.description());

        //Adding Milk to Coffee
        coffee = new MilkDecorator(coffee);
        System.out.println("Cost $"+coffee.cost()+" , Description: "+coffee.description());

        //Adding Sugar to Coffee
        coffee = new SugarDecorator(coffee);
        System.out.println("Cost $"+coffee.cost()+" , Description: "+coffee.description());
    }
}
