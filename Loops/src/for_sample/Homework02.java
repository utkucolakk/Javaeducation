package for_sample;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı grininiz: ");
        int sayi = scanner.nextInt();

        int ciftSayac = 0;

        for (int i = sayi; i>=1; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
                ciftSayac++;
            }
        }

        System.out.println(sayi + " 'den' 1'e kadar olan çift sayıların sayısı:  " + ciftSayac);
    }
}
