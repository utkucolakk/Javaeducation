package constructor_samples.constructor_sample03;

public class A {

    B b;

    public A() {
        System.out.println("Hello I'm a constructor of A");
        b = new B();

    }

    public void sayHello() {

        b.sayHello();

    }

    public void sum (int number1 , int number2) {
      int sum = b.sum(number1, number2);
        System.out.println("toplam : " + sum);
    }
}
