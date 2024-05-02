package interface_samples.interface_sample02;

public class ProgrammingLanguage implements Language{
    @Override
    public void getName(String name) {
        System.out.println("Programming language is : " + name);
    }
}
