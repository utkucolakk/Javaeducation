package inheritance_samples.inheritance_sample04;

public class Main {

    public static void main(String[] args) {

        Bmw bmw = new Bmw("bmw", 300, true);

        System.out.println("brand is " + bmw.getBrand());
        System.out.println("speed limit is " + bmw.getSpeedlimit());
        System.out.println("is there a help desk ? " + bmw.isHelpDesk());
    }
}
