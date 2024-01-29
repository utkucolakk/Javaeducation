package access_specifiers;

public class ProtectedMethodSample01 {
    public static void main(String[] args) {
        ProtectedMethodSample01 protectedMethodSample01 = new ProtectedMethodSample01();
        System.out.println(protectedMethodSample01.topla(5,3));

    }

    protected int topla(int number1, int number2) {
        return number1 + number2;
    }
}
