package do_while_sample;

import java.util.Scanner;

public class Homework03 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int gHakki = 3;
        String sifre = "bilgeAdam!";
        String kSifre;

        do {
            System.out.println("Şifrenizi giriniz: ");
            kSifre = scanner.next();

            if (kSifre.equals(sifre)) {
                System.out.println("Hoşgeldiniz!");
                break;
            }else {
                gHakki--;
                if (gHakki > 0 ) {
                    System.out.println("Yanlış şifre. Kalan giriş hakkınız: " + gHakki);
                }else {
                    System.out.println("Hesabınız bloke oldu. İyi günler!");
                }
            }
        }while (gHakki > 0);
    }
}
