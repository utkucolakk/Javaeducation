import java.util.Scanner;

public class Sample05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num;
        int reverse = 0;

        System.out.println("Bir sayı giriniz: ");
        num = scanner.nextInt();

        int temp = num;
        int remainder;

        while (temp != 0) {
            remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp /= 10;
        }

        System.out.println("Girilen sayının tersi: " + reverse);
    }
}
