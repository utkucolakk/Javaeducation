package return_methods;

import java.util.Scanner;

public class Homework02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sayi1;
        System.out.println("sayi giriniz : ");
        sayi1 = scanner.nextInt();
        int sonuc = toplam(sayi1);
        System.out.println(sayi1 + " değerine kadar olanların toplamı : " + sonuc);
    }

    public static int toplam(int number1) {
        int toplam = 0;
        for (int i = 1; i <= number1; i++) {
            toplam = toplam + i;
        }
        return toplam;
    }
}
