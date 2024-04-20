package designPatterns.builder;

public interface ComputerBuilder {
    Computer build();
    ComputerBuilder addCPU(String cpu);
    ComputerBuilder addRAM(String ram);
    ComputerBuilder addStorage(String storage);
    ComputerBuilder addGraphics(String graphicsCard);
}
