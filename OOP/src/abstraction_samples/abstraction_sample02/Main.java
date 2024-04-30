package abstraction_samples.abstraction_sample02;

public class Main {

    public static void main(String[] args) {
        Dikdortgen dikdortgen = new Dikdortgen(3, 5);
        double dikdortgenAlan = dikdortgen.alanHesapla();
        System.out.println("dikdörtgenin alanı : " + dikdortgenAlan);
        dikdortgen.yazdir();


        Daire daire = new Daire(4);
        double daireAlan = daire.alanHesapla();
        System.out.println("dairenin alanı : " + daireAlan);
        daire.yazdir();

    }
}
