package designPatterns.factorymethod;

public class ProductA implements Product{
    @Override
    public void createProduct() {
        System.out.println("Creating Product A");
    }
}
