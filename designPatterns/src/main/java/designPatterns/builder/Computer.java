package designPatterns.builder;

public class Computer {
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;

    public Computer(String cpu, String ram, String storage, String graphicsCard) {
        this.cpu = cpu;
        this.ram = ram;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", ram='" + ram + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                '}';
    }
}
