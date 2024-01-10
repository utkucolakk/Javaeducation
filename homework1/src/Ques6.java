public class Ques6 {
        public static void main(String[] args) {
            int x = 10; // Fibonacci il 10 terimi
            int sayi1 = 0, sayi2 = 1;

            System.out.println("Fibonacci Dizisi (ilk " + x + " terim):");

            int i = 1;
            while (i <= x) {
                System.out.print(sayi1 + " ");

                int toplam = sayi1 + sayi2;
                sayi1 = sayi2;
                sayi2 = toplam;

                i++;
            }
        }
    }


