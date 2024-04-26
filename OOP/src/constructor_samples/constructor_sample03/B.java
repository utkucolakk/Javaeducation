package constructor_samples.constructor_sample03;

public class B {

    B() {
        System.out.println("Hello I'm a constructor of B");
    }

    public void sayHello() {
        System.out.println("Hello I'm B sayHello method");
    }

    public int sum(int number1, int number2) {
        return number1 + number2;
    }
}
