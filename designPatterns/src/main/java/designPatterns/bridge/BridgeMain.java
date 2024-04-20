package designPatterns.bridge;

public class BridgeMain {
    public static void main(String[] args) {
        Device tvDevice = new TVDevice();
        RemoteControl tvRemoteControl = new TVRemoteControl(tvDevice);

        Device dvdDevice = new DVDDevice();
        RemoteControl dvdRemoteControl = new DVDRemoteControl(dvdDevice);

        tvRemoteControl.powerOn();
        tvRemoteControl.setChannel(3);
        tvRemoteControl.powerOff();

        dvdRemoteControl.powerOn();
        dvdRemoteControl.setChannel(1);
        dvdRemoteControl.powerOff();
    }
}
