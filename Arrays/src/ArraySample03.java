public class ArraySample03 {
    public static void main(String[] args) {

        int[] numbers = {2,-9,0,5,12,-25,22,9,8,12};
        int toplam = 0;

        for (int i : numbers){
            toplam = toplam+i; // toplam += i;


        }
        double ortalama = (double) toplam / numbers.length;
        System.out.println("Toplam:" + toplam);
        System.out.println("Ort:" + ortalama);
    }
}
