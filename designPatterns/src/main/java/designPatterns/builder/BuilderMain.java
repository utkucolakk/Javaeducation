package designPatterns.builder;

public class BuilderMain {

    public static void main(String[] args) {
        ComputerBuilder builder = new StandardComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);

        Computer customComputer = director.buildComputer();
        System.out.println(customComputer.toString());
    }
}
