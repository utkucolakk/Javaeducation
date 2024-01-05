import java.util.Scanner;

public class Algorithm01 {

    public static void main(String[] args) {
        // Klavyeden okuma yapmak için Scanner nesnesini oluştur.
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bir sayı giriniz : ");
        // nextInt() metodu ile tam sayı türünde değer okuması yapılır.
        int number = scanner.nextInt();
        System.out.println("Girilen sayı : " + number);
    }

}
