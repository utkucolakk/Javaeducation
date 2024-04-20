package designPatterns.singleton;

public class EagerSingleton {

    private static final EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton(){
        // Prevent direct instantiation
    }

    public static EagerSingleton getInstance(){
        return INSTANCE;
    }

}
