package designPatterns.singleton;

public class LazySingleton {

    private static LazySingleton instance;

    private LazySingleton(){
        // Prevent direct instantiation
    }

    public static synchronized LazySingleton getInstance(){
        if(instance==null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
