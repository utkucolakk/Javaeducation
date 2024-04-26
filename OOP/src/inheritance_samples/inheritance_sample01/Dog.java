package inheritance_samples.inheritance_sample01;

public class Dog extends Animal  {

    public void run() {
        System.out.println("Dog is running");
    }

    @Override
    public void eat() {
        System.out.println("Dog is eating");
    }
}
