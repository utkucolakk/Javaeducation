public class CastingExample1 {

    public static void main(String[] args) {
        byte byteNumber = 1;
        short shortNumber = 1868;


        short newShort = byteNumber;  // short newShort = (short)byteNumber
        byte newByte = (byte) shortNumber;


        //Widening Casting
        int intNumber = 9;
        double doubleNumber = intNumber;
        System.out.println(doubleNumber);



        // Norrowing Casting (manually)
        double doubleNumber2 = 9.5;
        int newIntNumber = (int) doubleNumber;
        System.out.println(newIntNumber);
    }
}
