package designPatterns.bridge;

public class DVDRemoteControl extends  RemoteControl{
    public DVDRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void powerOn() {
        System.out.println("DVD Remote: Turning on DVD");
        device.turnOn();
    }

    @Override
    public void powerOff() {
        System.out.println("DVD Remote: Turning off DVD");
        device.turnOff();
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("DVD Remote: Cannot set channel for DVD");
    }
}
