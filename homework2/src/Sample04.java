import java.util.Scanner;

public class Sample04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int num;
        int fact = 1;
        System.out.println("Pozitif bir sayı giriniz: ");
        num = scanner.nextInt();

        for (int i=1; i<=num; i++)
        {
            fact *=i;
        }
        System.out.println("Faktoriyel: " + fact);
    }
}

