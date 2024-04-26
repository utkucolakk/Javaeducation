package inheritance_samples.inheritance_sample04;

public class Bmw extends Car {

    private boolean isHelpDesk;

    public Bmw(String brand, int speedlimit, boolean isHelpDesk) {
        super(brand, speedlimit);
        this.isHelpDesk = isHelpDesk;
    }

    public boolean isHelpDesk() {
        return isHelpDesk;
    }

    public void setHelpDesk(boolean helpDesk) {
        isHelpDesk = helpDesk;
    }
}
