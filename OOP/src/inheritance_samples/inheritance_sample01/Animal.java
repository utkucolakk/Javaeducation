package inheritance_samples.inheritance_sample01;

public class Animal {

    private String name;

    private String gender;

    private int age;

    private boolean isReptile;

    public void eat() {
        System.out.println("animal is eating");
    }

    public void see() {
        System.out.println("I am an animal I can see everything");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isReptile() {
        return isReptile;
    }

    public void setReptile(boolean reptile) {
        isReptile = reptile;
    }
}