package abstraction_samples.abstraction_sample04;

public class BirikimHesap extends Hesap{

    private double faizOrani;

    public BirikimHesap(String hesapNo, double faizOrani) {
        super(hesapNo);
        this.faizOrani = faizOrani;
    }

    @Override
    public void paraCek(double miktar) {
        if (miktar <= getBakiye()) {
            paraYatir(-miktar);
            System.out.println(miktar + "tl çekildi.");
        }else {
            System.out.println("Yetersiz bakiye!");
        }
    }

    public void faizEkle() {
        double faizMiktari = getBakiye() * faizOrani;
        paraYatir(faizMiktari);
        System.out.println("Faiz eklendi : " + faizMiktari + "TL");
    }
}
