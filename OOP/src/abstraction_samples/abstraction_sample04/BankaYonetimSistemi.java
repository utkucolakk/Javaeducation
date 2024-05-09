package abstraction_samples.abstraction_sample04;

public class BankaYonetimSistemi {
    public static void main(String[] args) {

            Musteri musteri1 = new Musteri("Ali", "123456");
            Musteri musteri2 = new Musteri("Ayşe", "987654");

            VadesizHesap hesap1 = new VadesizHesap("876543");
            BirikimHesap hesap2 = new BirikimHesap("567890", 0.05);

            musteri1.hesapEkle(hesap1);
            musteri2.hesapEkle(hesap2);

            musteri1.paraYatir("876543", 1000);
            musteri1.paraCek("876543", 500);
            musteri1.bakiyeSorgula("876543");

            musteri2.paraYatir("567890", 2000);
            musteri2.paraCek("567890", 1000);
            musteri2.bakiyeSorgula("567890");

            hesap2.faizEkle();
            musteri2.bakiyeSorgula("567890");

    }
}
