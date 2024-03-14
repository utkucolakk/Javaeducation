package do_while_sample;

import java.util.Scanner;

public class Homework04 {
    public static void main(String[] args) {
        int sifre, parola, hak;
        Scanner scanner = new Scanner(System.in);
        parola = 12345;
        hak = 3;

        do {
            System.out.println("Şifre giriniz:");
            sifre = scanner.nextInt();
            if (sifre == parola) {
                System.out.println("Giriş başarılı");
                break;
            }else{
                hak--;
                System.out.println("Giriş başarısız! " + hak + " kaldı");
                if (hak == 0) {
                    System.out.println("Hakkınız bitti. Çıkılıyor..");
                    break;
                }
            }
        } while (hak > 0);
    }
}
