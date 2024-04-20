package designPatterns.bridge;

public class TVRemoteControl extends RemoteControl{
    public TVRemoteControl(Device device) {
        super(device);
    }

    @Override
    public void powerOn() {
        System.out.println("TV Remote: Turning on TV");
        device.turnOn();
    }

    @Override
    public void powerOff() {
        System.out.println("TV Remote: Turning off TV");
        device.turnOff();
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("TV Remote: Setting TV Channel to"+channel);
        device.setChannel(channel);
    }
}
