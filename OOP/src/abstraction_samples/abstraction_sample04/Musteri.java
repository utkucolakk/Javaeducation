package abstraction_samples.abstraction_sample04;

import java.util.ArrayList;
import java.util.List;

public class Musteri {

    private String ad;
    private String hesapNo;
    private List<Hesap> hesaplar;

    public Musteri(String ad, String hesapNo) {
        this.ad = ad;
        this.hesapNo = hesapNo;
        this.hesaplar = new ArrayList<>();
    }
        public String getAd() {
        return ad;
    }
        public String getHesapNo() {
        return hesapNo;
    }
    public void hesapEkle(Hesap hesap) {
        hesaplar.add(hesap);
    }

    public void paraYatir(String hesapNo, double miktar) {
        Hesap hesap = hesapBul(hesapNo);
        if (hesap != null) {
            hesap.paraYatir(miktar);
        }else {
            System.out.println("Hesap bulunamadı!");
        }
    }
    public void paraCek(String hesapNo, double miktar) {
        Hesap hesap = hesapBul(hesapNo);
        if (hesap != null) {
    }else {
            System.out.println("Hesap bulunamadı!");
        }
}

public void bakiyeSorgula(String hesapNo){
        Hesap hesap = hesapBul(hesapNo);
        if (hesap != null) {
            System.out.println("Hesap No: " + hesap.getHesapNo() + "Bakiye: " + hesap.getBakiye());
        }else {
            System.out.println("Hesap bulunamadı!");
        }
}
private Hesap hesapBul(String hesapNo) {
        for (Hesap hesap : hesaplar) {
            if (hesap.getHesapNo().equals(hesapNo)) {
                return hesap;
            }
        }
        return null;
}
}