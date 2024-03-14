import java.util.Random;

public class ArraySample04 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[20];
        int toplam = 0;
        int temp;
        for (int i=0; i<numbers.length; i++) {
            numbers[i] = random.nextInt(50) + 1;
            toplam = toplam + numbers[i];

/*

            temp = random.nextInt(50) + 1;
            numbers[i] = temp;
            toplam = toplam + temp; */

        }
        System.out.println("Sayıların toplamı : " + toplam);
        System.out.println("Sayıların ort " + ((double)toplam/ numbers.length));
    }
}
