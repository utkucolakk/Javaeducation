package class_sample03;

public class Main {
    public static void main(String[] args) {

        Account serdar = new Account();
        serdar.budget = 5000;
        serdar.id = 1L;
        serdar.gender = "male";
        serdar.name = "serdar";
        serdar.password = "123456";




        Account utku = new Account();
        utku.budget = 2000;
        utku.id = 2L;
        utku.gender = "male";
        utku.name = "utku";
        utku.password = "654321";

        //serdar
        serdar.withdraw(300);
        System.out.println("Serdar'ın kalan parası: " + serdar.budget);
        serdar.withdraw(250);
        System.out.println("Serdar'ın kalan parası: " + serdar.budget);
        serdar.deposit(50);
        System.out.println("Serdar'ın kalan parası: " + serdar.budget);

        //utku
        utku.deposit(2000);
        System.out.println("Utku'nun kalan parası: " + utku.budget);
        utku.withdraw(5000);
        System.out.println("Utku'nun kalan parası: " + utku.budget);
    }
}
