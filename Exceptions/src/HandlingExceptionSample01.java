
public class HandlingExceptionSample01 {
    public static void main(String[] args) {
        int number1 = 5;


        try {
            System.out.println("number1 / 0 = " + (number1 / 0));
            System.out.println("Başarılı oldu.");
        } catch (ArithmeticException arithmeticException) {
            System.out.println("catch aritmetichException! description -> " + arithmeticException.getMessage());
        }finally {
            System.out.println("Her zaman çalışır.");
        }
        System.out.println("Uygulama kapatılıyor.");
    }
}
