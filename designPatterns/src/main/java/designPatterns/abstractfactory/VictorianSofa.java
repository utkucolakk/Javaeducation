package designPatterns.abstractfactory;

public class VictorianSofa implements Sofa{
    @Override
    public void relaxOn() {
        System.out.println("Relaxing on a Victorian Sofa");
    }
}
