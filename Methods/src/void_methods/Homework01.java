package void_methods;

public class Homework01 {
    public static void main(String[] args) {
        int sayi1 = 9;
        int sayi2 = 3;
        toplama(sayi1, sayi2);
        cikarma(sayi1, sayi2);
        bolme(sayi1, sayi2);
        carpma(sayi1, sayi2);

    }

    public static void toplama(int sayi1, int sayi2) {
        System.out.println(sayi1 + sayi2);
    }

    public static void cikarma(int sayi1, int sayi2) {
        System.out.println(sayi1 - sayi2);
    }

    public static void bolme(int sayi1, int sayi2) {
        System.out.println((double) sayi1 / sayi2);
    }


    public static void carpma(int sayi1, int sayi2) {
        System.out.println(sayi1 * sayi2);

    }
}

