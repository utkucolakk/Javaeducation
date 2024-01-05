public class VariableExample1 {

    public static void main(String[] args) {
        //veri tipi değişken adı
        int intNumber; // int -> veri tipimiz (tam sayı)
        //intNumber -> değişkenimiz.
        long longNumber = 2132132;
        byte byteNumber =  127;
        short shortNumber = 345;


        float floatNumber = 2.3456f; // ondalıklı sayı
        double doubleNumber = 612;
        System.out.println();



        char charExample = 'K';
        String name = "kadir";

        int number1 = 5;
        long toplam = 5 + 3;

        boolean isHigher = number1 < 1;
        System.out.println("isHigher : " + isHigher);
        if(isHigher) {
            System.out.println("Büyüktür.");
        }

        System.out.println("işlem bitiyor.");
        //Not: String - Array haricinde primitive veri tipleri primitive tip olarak geçerler.

    }

}
