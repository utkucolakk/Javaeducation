package designPatterns.builder;

public class ComputerDirector {
    private ComputerBuilder builder;

    public ComputerDirector(ComputerBuilder builder){
        this.builder = builder;
    }

    public Computer buildComputer(){
        return builder.addCPU("Intel i5").addRAM("16GB DDR2").addStorage("1TB SDD").addGraphics("NVIDIA GTX 1660").build();
    }
}
