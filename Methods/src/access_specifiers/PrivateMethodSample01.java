package access_specifiers;

public class PrivateMethodSample01 {
    public static void main(String[] args) {
        PrivateMethodSample01 privateMethodSample01 = new PrivateMethodSample01();
        System.out.println(privateMethodSample01.topla(5,9));

    }


    private int topla(int number1, int number2) {
        return number1 + number2;
    }
}
