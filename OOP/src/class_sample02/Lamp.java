package class_sample02;

public class Lamp {

    boolean isOn;

    public void turnOn() {
        isOn = true;
        System.out.println("turnOn Method Lamba şuan -> " + isOn);
    }


    public  void turnOff() {
        isOn = false;
        System.out.println("turnOff Method Lamba Şuan -> " + isOn);

    }


    public void stateOfLamp() {
        System.out.println("stateOfLamp -> " + isOn);
    }
}
