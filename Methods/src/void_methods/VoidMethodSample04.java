package void_methods;

import java.util.Scanner;

public class VoidMethodSample04 {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 3;
        sum(number1, number2, "bilgeadam");

    }

    public static void sum (int num1, int num2, String name) {
        System.out.println(" iki sayının toplamı : "  + (num1 + num2));
        System.out.println(name);

    }
}
