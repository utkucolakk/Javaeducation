import java.util.Scanner;

public class Sample06 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int num;

        System.out.println("Pozitif bir tam sayı giriniz: ");
        num = scanner.nextInt();

        boolean flag = true;

        for (int i=2; i<num; i++) {
            if (num % i == 0)
            {
                flag = false;
                break;
            }
        }

        if(flag && num > 1)
        {
            System.out.println("Sayı asaldır.");
        }
        else
        {
            System.out.println("Sayı asal değildir.");
        }
    }
}
