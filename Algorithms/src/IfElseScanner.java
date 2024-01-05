import java.util.Scanner;

public class IfElseScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen kullanıcı adınızı giriniz:");
        scanner.nextLine();
        String username = scanner.nextLine();

        System.out.println("Lütfen şifrenizi giriniz:");
        String password = scanner.nextLine();

        if(username.equals("bilgeadam") && password.equals("!bilgeadam1")) {
            System.out.println("Hoşgeldiniz, ana sayfaya yönlendirliyorsunuz");

        } else {
            System.out.println("Üzgünüm kullanıcı adınız veya şifreniz yanlış girilmiştir");
        }
    }
}
