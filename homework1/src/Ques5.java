import java.util.Scanner;

public class Ques5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pozitiif bir sayı girin : ");
        int sayi1 = scanner.nextInt();

        for (int sayi2 = 1; sayi2 <= sayi1; sayi2++) {
            if (sayi2 % 2 == 0 ) {
                System.out.println(sayi2 + "sayı çifttir.");
            } else {
                System.out.println(sayi2 + "sayı tektir.");
            }
        }
    }
}

  // Hocam ben burda hangi işlemi yanlış yaptığım için bütün sayıları yazdırıyor anlayamadım sadece yazdığımız sayıyı
 // yazdırmamız gerekmiyor mu?