package singleton_design_pattern.lazy;

public class Main {
    public static void main(String[] args) {
        SingletonSample singletonSample1 = SingletonSample.getInstance();
        SingletonSample singletonSample2 = SingletonSample.getInstance();
        SingletonSample singletonSample3 = SingletonSample.getInstance();
        singletonSample1.printHello("utku");
        singletonSample2.printHello("burak");
        singletonSample3.printHello("yaren");
        //     SingletonSample singletonSample4 = new SingletonSample();
      /* SingletonSample singletonSample1 = new SingletonSample();
        SingletonSample singletonSample2 = new SingletonSample();
        SingletonSample singletonSample3 = new SingletonSample();
        singletonSample1.printHello("utku");
        singletonSample2.printHello("burak");
        singletonSample3.printHello("yaren");*/
        System.out.println();
    }
}