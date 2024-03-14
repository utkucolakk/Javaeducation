package while_sample;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);

        String kAdi = "Utii";
        String kSifre = "Password";
        int gHak = 3;
        while (gHak > 0) {
            System.out.println("Kullanıcı Adı: ");
            String kullaniciAdi = oku.nextLine();
            System.out.println("Şifreniz: ");
            String sifre = oku.nextLine();

            if (kullaniciAdi.equals(kAdi) && sifre.equals(kSifre)) {
                System.out.println("Hoşgeldin Başkan!");
                break;
            }else {
                gHak--;
                System.out.println("Düzgin gir. Kalan hakkın " + gHak);
            }
        }
        if (gHak == 0) {
            System.out.println("Program sonlandırılıyor.");
        }
    }
}
