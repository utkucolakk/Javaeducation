package class_samples.class_sample02;

public class LampMain {

    public static void main(String[] args) {
        Lamp livingRoomLamp = new Lamp();
        livingRoomLamp.stateOfLamp();
        livingRoomLamp.turnOn();
        System.out.println("livingRoom son hali :  " + livingRoomLamp.isOn);

      /*  livingRoomLamp.turnOff();
        System.out.println(livingRoomLamp.isOn);

    */


        Lamp bedroomLamp = new Lamp();
        System.out.println("bedroom son hali : " + bedroomLamp.isOn);
        bedroomLamp.turnOn();
    }
}
