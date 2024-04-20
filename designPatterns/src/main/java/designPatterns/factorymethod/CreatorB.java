package designPatterns.factorymethod;

public class CreatorB implements Creator{
    @Override
    public Product factoryMethod() {
        return new ProductB();
    }
}
