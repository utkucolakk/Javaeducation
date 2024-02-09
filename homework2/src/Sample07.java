import java.util.Scanner;

public class Sample07 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num1, num2;
        char choice;

        do {
            System.out.println("Birinci sayıyı giriniz");
            num1 = scanner.nextInt();

            System.out.println("İkinci sayıyı giriniz");
            num2 = scanner.nextInt();

            int sum = num1 + num2;
            System.out.println("Sayıların toplamı: " + sum);

            System.out.println("İşleme devam etmek ister misiniz? e/h ? ");
            choice = scanner.next().charAt(0);

            System.out.println();

        }while (choice == 'e' || choice == 'E');
    }
}
