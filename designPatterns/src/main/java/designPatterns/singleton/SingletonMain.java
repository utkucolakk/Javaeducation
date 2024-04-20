package designPatterns.singleton;

public class SingletonMain {

    public static void main(String[] args) {
        BasicSingleton s1 = BasicSingleton.getInstance();
        BasicSingleton s2 = BasicSingleton.getInstance();
        System.out.println(s1 == s2);

        LazySingleton l1 = LazySingleton.getInstance();
        LazySingleton l2 = LazySingleton.getInstance();
        System.out.println(l1 == l2);

        EagerSingleton e1 = EagerSingleton.getInstance();
        EagerSingleton e2 = EagerSingleton.getInstance();
        System.out.println(e1 == e2);
    }
}
