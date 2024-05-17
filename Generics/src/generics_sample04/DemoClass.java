package generics_sample04;

public class DemoClass {

    public <T> void genericMethod(T data) {
        System.out.println("Generic Method");
        System.out.println("Data passed : " + data);
    }
}
