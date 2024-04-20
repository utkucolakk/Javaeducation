package designPatterns.abstractfactory;

public class AbstractFactoryMain {

    private static FurnitureFactory factory;

    public AbstractFactoryMain(FurnitureFactory factory){
        this.factory = factory;
    }

    public void createFurniture(){
        factory.createChair().sitOn();
        factory.createSofa().relaxOn();
    }

    public static void main(String[] args) {
        FurnitureFactory furnitureFactory = new ModernFurnitureFactory();
        furnitureFactory.createChair().sitOn();
        furnitureFactory.createSofa().relaxOn();

        AbstractFactoryMain client = new AbstractFactoryMain(new VictorianFurnitureFactory());
        client.createFurniture();
    }
}
