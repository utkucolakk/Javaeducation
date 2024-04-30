package abstraction_samples.abstraction_sample02;

public class Dikdortgen extends Sekil{

    private double uzunluk;

    private double genislik;


    public Dikdortgen(double uzunluk, double genislik) {
        this.uzunluk = uzunluk;
        this.genislik = genislik;
    }

    @Override
    public double alanHesapla() {
        return uzunluk * genislik   ;
    }
}
