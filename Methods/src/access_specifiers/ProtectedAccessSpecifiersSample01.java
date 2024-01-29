package access_specifiers;

import protected_sample.ProtectedMethodSample;

public class ProtectedAccessSpecifiersSample01 {
    public static void main(String[] args) {
        ProtectedMethodSample protectedMethodSample = new ProtectedMethodSample();
        //System.out.println(protectedMethodSample.topla(5,3));
        // erişemiyorum çünkü protected olan bir method farklı bir paket altında ise
        // kullanmak için, kalıtım (extends) edilmesi gerekir.



        ProtectedMethodSample01 protectedMethodSample01 = new ProtectedMethodSample01();
        System.out.println(protectedMethodSample01.topla(5,10));
        // erişebildim çünkü aynı paket içerisinde protected methoda erişebilirim.
    }
}
