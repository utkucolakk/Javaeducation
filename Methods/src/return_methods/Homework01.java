package return_methods;

import java.util.Scanner;

public class Homework01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayı1 gir : ");
        int sayi1 = scanner.nextInt();
        System.out.println("sayı2 gir : ");
        int sayi2 = scanner.nextInt();
        System.out.println("büyük sayı " + (10 + buyuk(sayi1,sayi2)));


    }


    public static int buyuk (int sayi1, int sayi2) {

        if (sayi1 > sayi2) {
            return sayi1;

        }else if (sayi1 < sayi2) {

            return sayi2;
        } else {
            System.out.println("eşit");
            return sayi1;
        }

    }
}

