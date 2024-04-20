package designPatterns.bridge;

public class TVDevice implements Device{
    @Override
    public void turnOn() {
        System.out.println("TV Turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV Turned off");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Switched TV Channel to "+ channel);
    }
}
