package generics_sample04;

public class GenericMethod02 {


    public static void main(String[] args) {
        DemoClass demoClass = new DemoClass();
        demoClass.genericMethod("hello");

        demoClass.genericMethod(15);
    }
}
