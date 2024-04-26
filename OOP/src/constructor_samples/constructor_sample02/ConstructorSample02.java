package constructor_samples.constructor_sample02;

public class ConstructorSample02 {

    int age;
    ConstructorSample02() {
        this.age = 55;
    }

    public static void main(String[] args) {
        ConstructorSample02 constructorSample02 = new ConstructorSample02();
        System.out.println(constructorSample02.age);
        constructorSample02.sayHello();
    }


    public void sayHello() {
        System.out.println("Hello");

    }
}
