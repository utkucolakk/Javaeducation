package constructor_samples.constructor_overloading_sample01;

public class Cat {

    String name;

    int age;

    String color;

    Cat() {
        System.out.println("no-arg constructor");
    }

    Cat(String name) {
        System.out.println("1 String args constructor : " + name);

    }

    Cat(int age) {

    }

    Cat(String name, String color) {

    }

    Cat(String color, String name, int age) {
        System.out.println("3 String args constructor : " + color + " , " + name + " , " + age + " , ");

    }



}
