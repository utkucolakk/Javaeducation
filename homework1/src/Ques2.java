import java.util.Scanner;

public class Ques2 {

    public static class ques2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Pozitif bir tam sayı girin: ");
            int sayi = scanner.nextInt();

            long faktoriyel = 1;
            int sayi2 = 1;

            while (sayi2 <= sayi) {
                faktoriyel *= sayi2;
                sayi2++;
            }

            System.out.println(sayi + " sayısının faktöriyeli: " + faktoriyel);


        }
    }

}
