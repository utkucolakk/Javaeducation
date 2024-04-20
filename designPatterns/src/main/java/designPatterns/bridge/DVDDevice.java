package designPatterns.bridge;

public class DVDDevice implements Device{
    @Override
    public void turnOn() {
        System.out.println("Turned on DVD");
    }

    @Override
    public void turnOff() {
        System.out.println("Turned off DEV");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("No Support: Cannot set DVD Channel");
    }
}
