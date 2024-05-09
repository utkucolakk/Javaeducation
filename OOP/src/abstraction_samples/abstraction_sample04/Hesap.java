package abstraction_samples.abstraction_sample04;

abstract class Hesap {
    private String hesapNo;
    private double bakiye;

    public Hesap(String hesapNo) {
        this.hesapNo = hesapNo;
        this.bakiye = 0.0;
    }

    public String getHesapNo() {
        return hesapNo;
    }
    public double getBakiye() {
        return bakiye;
    }
    public void paraYatir(double miktar) {
        bakiye += miktar;
    }
    public abstract void paraCek(double miktar);
}
