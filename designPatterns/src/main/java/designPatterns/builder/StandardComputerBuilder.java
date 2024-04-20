package designPatterns.builder;

public class StandardComputerBuilder implements ComputerBuilder{
    private String cpu;
    private String ram;
    private String storage;
    private String graphicsCard;
    @Override
    public Computer build() {
        return new Computer(cpu, ram, storage, graphicsCard);
    }

    @Override
    public ComputerBuilder addCPU(String cpu) {
        this.cpu = cpu;
        return this;
    }

    @Override
    public ComputerBuilder addRAM(String ram) {
        this.ram = ram;
        return this;
    }

    @Override
    public ComputerBuilder addStorage(String storage) {
        this.storage = storage;
        return this;
    }

    @Override
    public ComputerBuilder addGraphics(String graphicsCard) {
        this.graphicsCard = graphicsCard;
        return this;
    }
}
