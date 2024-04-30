package abstraction_samples.abstraction_sample02;

public class Daire extends Sekil{

    private double yaricap;

    public Daire(double yaricap) {
        this.yaricap = yaricap;
    }
    @Override
    public double alanHesapla() {
        return Math.PI * Math.pow(yaricap,2);
    }
}
