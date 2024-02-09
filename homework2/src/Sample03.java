import java.util.Scanner;

public class Sample03 {
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         int num;
        System.out.println("Pozitif bir tam sayı giriniz:");
        num = scanner.nextInt();

        System.out.println("Çarpım Tabllosu  " + num);

        for (int i=1; i<=10; i++)
        {
            System.out.println(num + " x " + i + " = " + (num*i));
        }
    }
}
