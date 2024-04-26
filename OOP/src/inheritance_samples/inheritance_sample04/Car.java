package inheritance_samples.inheritance_sample04;

public class Car {

    private String brand;

    private int speedlimit;

    public Car(String brand, int speedlimit) {
        this.brand = brand;
        this.speedlimit = speedlimit;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSpeedlimit() {
        return speedlimit;
    }

    public void setSpeedlimit(int speedlimit) {
        this.speedlimit = speedlimit;
    }
}
