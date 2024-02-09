import java.util.Scanner;

public class Sample10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int toplam = 0, sayi =0;
        for (int i=0; i < 10; i++) {
            System.out.println("Bir sayı giriniz: ");
            sayi = scanner.nextInt();
            toplam = toplam + sayi;

        }
        System.out.println("Sayıların toplamı: " + toplam);
    }
}
