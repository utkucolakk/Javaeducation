public class UncaughtExceptionSample01 {
    public static void main(String[] args) {
        UncaughtExceptionSample01 uncaughtExceptionSample01 = new UncaughtExceptionSample01();
        uncaughtExceptionSample01.method1(null);

    }

    public void method1(String name) {
        System.out.println("method1");
        try {
            method2(name);
        }catch (NullPointerException nullPointerException) {
            System.out.println("NullPointerException catch!");
        }
        System.out.println("method1 works");
    }
    public void method2(String name) {
        System.out.println("method2");
        method3(name);
        System.out.println("method2 works");
    }

    public void method3(String name) {
        name.toLowerCase();
        System.out.println("method3 works");
    }
}
