package designPatterns.singleton;

public class BasicSingleton {
    private static BasicSingleton instance;

    private BasicSingleton(){
        // Prevents direct instantiation
    }

    public static BasicSingleton getInstance() {
        if(instance == null) {
            instance = new BasicSingleton();
        }
        return instance;
    }

    // Other methods
}
