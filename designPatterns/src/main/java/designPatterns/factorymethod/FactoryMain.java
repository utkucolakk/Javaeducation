package designPatterns.factorymethod;

public class FactoryMain {

    public static void main(String[] args) {

        Creator creatorA = new CreatorA();
        Creator creatorB = new CreatorB();

        Product productA = creatorA.factoryMethod();
        Product productB = creatorB.factoryMethod();

        productA.createProduct();
        productB.createProduct();
    }
}

